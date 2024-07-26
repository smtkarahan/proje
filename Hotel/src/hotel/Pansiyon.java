package hotel;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import hotel.Oda.Durum;

public class Pansiyon {

    Scanner sc = new Scanner(System.in);
    private final String PansiyonAdi;
    private final int ToplamOdaSayisi;
    private final int TamServis = 100;
    private final int YarımHizmet = 80;
    private final int SadeceOda = 60;
    private final int FransızTost = 10;
    private final int Hamburger = 12;
    private final int su = 3;
    private final int yüzde;
    Oda[] Odalar;
    private int Fatura = 0;
    private int r1 = 0;
    private int r2 = 0;
    private int r3 = 0;
    private int r4 = 0;
    private int r5 = 0;

    public Pansiyon(String PansiyonAdi, int ToplamOdaSayisi) {
        this.PansiyonAdi = PansiyonAdi;
        this.ToplamOdaSayisi = ToplamOdaSayisi;
        yüzde = ToplamOdaSayisi / 10;
        Odalar = new Oda[ToplamOdaSayisi];
        for (int i = 0; i < ToplamOdaSayisi; i++) {
            if (yüzde * 2 > i) {
                Odalar[i] = new Oda("10" + i, 0, 2, Oda.Türler.YatakOdası2);
                r1++;
            }
            if (yüzde * 2 <= i && yüzde * 4 > i) {
                Odalar[i] = new Oda("10" + i, 0, 3, Oda.Türler.YatakOdası3);
                r2++;
            }
            if (yüzde * 4 <= i && yüzde * 6 > i) {
                Odalar[i] = new Oda("10" + i, 0, 4, Oda.Türler.YatakOdası4);
                r3++;
            }
            if (yüzde * 6 <= i && yüzde * 7 > i) {
                Odalar[i] = new Oda("10" + i, 100, 5, Oda.Türler.KingSüit);
                r4++;
            }
            if (yüzde * 7 <= i && ToplamOdaSayisi > i) {
                Odalar[i] = new Oda("10" + i, -25, 6, Oda.Türler.EkonomikOda);
                r5++;
            }

        }
    }

    public void CutomerEnterence() {
        //Oda TheOda=new Oda(SadeceOda, Oda.Types.KingSuite);
        System.out.println("Hangi oda tipinde kalmak istiyorsunuz?");
        System.out.println("1. 2 Kişilik Normal Yatak Odasına");
        System.out.println("2. 3 Kişilik Normal Yatak Odasına");
        System.out.println("3. 4 Kişilik Normal Yatak Odası");
        System.out.println("4. 6 Kişilik Ekonomik Yatak Odası");
        System.out.println("5. 5 Kişilik King Süit");
        int S = GetInteger(5);

        switch (S) {
            case 1:
                KişiEkle(2, Odalar[r1]); 
                r1--; 
                break;
            case 2:
                KişiEkle(3, Odalar[r2]);
                r2--;
                break;
            case 3:
                KişiEkle(4, Odalar[r3]);
                r3--;
                break;
            case 4:
                KişiEkle(6, Odalar[r4]);
                r4--;
                break;
            case 5:
                KişiEkle(5, Odalar[r5]);
                r5--;
                break;
            default:
                System.out.println("Yanlış! Seçim 1-5 Arasında Olmalı");
        }
    }

    private void KişiEkle(int Sayi, Oda r) {

        int OdaMateSayisi = 0;
        ArrayList<Musteri> list = new ArrayList<Musteri>();
        Musteri c1;

        char Seçenek = 'Y';
        while (Seçenek == 'Y') {
            System.out.println((OdaMateSayisi + 1) + ".Kişi");

            System.out.print("İsim: ");
            String İsim = GetString();

            System.out.print("Soyisim: ");
            String Soyisim = GetString();

            System.out.print("Meslek: ");
            String Meslek = GetString();

            System.out.print("Yas: ");
            int Yas = GetInteger(100);

            System.out.println("1 -> ERKEK \n2 -> KADIN");
            int Son = GetInteger(2);
            while (true) {
                if (Son == 1) {
                    c1 = new Musteri(İsim, Soyisim, Meslek, Yas, Musteri.Son.BAY);
                    break;
                } else if (Son == 2) {
                    c1 = new Musteri(İsim, Soyisim, Meslek, Yas, Musteri.Son.BAYAN);
                    break;
                }
            }
            System.out.println("Hangi Hizmeti İstiyorsunuz? ");
            System.out.println(" 1 -> Tam Hizmet: 1500TL \\n 2 -> Yarım Hizmet:800TL  \\n 3 -> Sadece Oda:500TL ");
            int Hizmet = GetInteger(3);
            while (true) {
                if (Hizmet == 1) {
                    if (c1.getYas() > 12) {
                        Fatura += TamServis;
                    } else {
                        Fatura += TamServis / 2;
                    }
                    break;
                } else if (Hizmet == 2) {
                    if (c1.getYas() > 12) {
                        Fatura += YarımHizmet;
                    } else {
                        Fatura += YarımHizmet / 2;
                    }
                    break;
                } else if (Hizmet == 3) {
                    if (c1.getYas() > 12) {
                        Fatura += SadeceOda;
                    } else {
                        Fatura += SadeceOda / 2;
                    }
                    break;
                } else {
                    System.out.println("Yanlış! Seçim 1-3 Arasında Zorunludur");
                }
            }
            r.setFatura(Fatura);
            list.add(c1);
            OdaMateSayisi++;
            System.out.println("Daha fazla kişi eklemek ister misiniz?(E/H)");
            String temp=sc.next().toUpperCase();
            Seçenek = temp.charAt(0);
           
            if (OdaMateSayisi == Sayi) {
                Seçenek = 'N';
            }
        }
        Musteri[] OdaMates = list.toArray(new Musteri[list.size()]);

        r.setCustomers(OdaMates);
        r.setS(Oda.Durum.UygunDegil);
    }

    public void CustomerLeaves() {
        ArrayList<Musteri> list = new ArrayList<Musteri>();
        System.out.print("Lütfen Oda Sayiarasını Giriniz:");
        String Sayi = GetString();
        Musteri c2 = new Musteri();
        for (Oda Oda : Odalar) {
            for (int i = 0; i < Oda.getMusteriSayisi(); i++) {
                 list.add(c2);
            }
        Musteri[] OdaMates = list.toArray(new Musteri[list.size()]);
            if (Oda.getOdaNumarası().equals(Sayi)) {
                Oda.setS(Durum.Mevcut);
                if (null != Oda.getType()) {
                    switch (Oda.getType()) {
                        case YatakOdası2:
                            Oda.setFatura(0);
                            Oda.setCustomers(OdaMates);
                            break;
                        case YatakOdası3:
                            Oda.setCustomers(OdaMates);
                            Oda.setFatura(0);
                            break;
                        case YatakOdası4:
                            Oda.setCustomers(OdaMates);
                            Oda.setFatura(0);
                            break;
                        case EkonomikOda:
                            Oda.setCustomers(OdaMates);
                            Oda.setFatura(-50);
                            break;
                        case KingSüit:
                            Oda.setCustomers(OdaMates);
                            Oda.setFatura(100);
                            break;
                        default:
                            break;
                    }
                }

            }
        }

    }

    public void DisplayOdalar() {

        for (Oda Oda : Odalar) {
            Oda.Görüntülemek();
        }

    }

    public void DisplayCustomers() {
        for (Oda Oda : Odalar) {
            Oda.DisplayCutomers();
        }

    }

    public void Order() {
        System.out.print("Lütfen Oda Sayiarasını Giriniz: ");
        String Sayi = GetString();
        int Seçenek;
        for (Oda Oda : Odalar) {
            if (Sayi.equals(Oda.getOdaNumarası())) {

                boolean flag = true;
                while (flag) {

                    System.out.println("1. Fransız Tostu: 150TL");
                    System.out.println("2. Hamburger: 250TL");
                    System.out.println("3. Su: 50TL");
                    System.out.println("4. Çıkış ");
                    Seçenek = GetInteger(4);
                    switch (Seçenek) {
                        case 1:
                            System.out.println("Fransız Tostu sipariş ettiniz");  
                            Fatura += FransızTost;
                            break;
                        case 2:
                            System.out.println("Burger sipariş ettin");
                            Fatura += Hamburger;
                            break;
                        case 3:
                            System.out.println("Su sipariş ettiniz");
                            Fatura += su;
                            break;
                        case 4:
                            Oda.setFatura(Fatura);
                            flag = false;
                            break;
                        default:
                            System.out.println("Yanlış! Seçim 1-4 Arasında Olmalı");
                    }

                }
            }
        }

    }

    /*------------SADECE İHTİYACIM OLAN ALICI--------------*/
    public String getPansiyonAdi() {
        return PansiyonAdi;
    }

    /*-------------------------------------------*/

 /*---------------TRY CATCH İLE GİRİŞ DÖNGÜSÜ--------------*/
    public int GetInteger(int Sayi) {
        int input = 0;
        do {
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Lütfen 1 ile arasında bir sayı verin " + Sayi);
                sc.next();
            }
        } while (input == 0);
        return input;
    }

    public String GetString() {
        String s = "";
        boolean t = true;
        while (t) {
            try {
                s = sc.next();
                t = false;
            } catch (InputMismatchException e) {
                System.out.println("Yanlış!");
                t = true;
            }
        }
        return s;
    }
    /*-------------------------------------------*/

	public int getToplamOdaSayisi() {
		return ToplamOdaSayisi;
	}

	public void DisplayRooms() {
		// TODO Auto-generated method stub
		
	}
}