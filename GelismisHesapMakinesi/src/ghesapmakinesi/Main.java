package ghesapmakinesi;

import java.util.Scanner;

//Gelişmiş Hesap Makinesi

public class Main {
	
	//Toplama işlemi
	static void artı() {
		int result = 0, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç sayı toplayacaksınız : ");
		int counter = sc.nextInt();
		
		for(int i =1; i <=counter; i++) {
			System.out.println(i + ". Sayı : ");
			num = sc.nextInt();
			result += num;
		}
		System.out.println("Toplam: " + result);
	}
	
	//Çıkartma İşlemi
	
	static void eksi() {
		int result = 0, num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Kaç sayı gireceksiniz:");
		int counter = sc.nextInt();
		for(int i =1; i <=counter; i++) {
			System.out.println(i + ". Sayı: ");
			num = sc.nextInt();
			if(i == 1) {
				result += num;
				continue;
			}
			result -= num;
		
		}
		System.out.println("Sonuç : " + result);
	}
	
	//Çarpma İşlemi
	
	static void carpma() {
		int result =1 ,num;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Kaç sayı gireceksiniz: ");
		int counter = sc.nextInt();
		for (int i =1; i<=counter; i++) {
			System.out.println( i + ".Sayı: ");
			num = sc.nextInt();
			if(num == 0) {
				result = 0;
				break;
			}
			result *= num;
		}
		System.out.println("Sonç : " + result);
	}
	
	// Bölmne İşlemi
	
	static void bolme() {
		double result = 0.0, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç sayı gireceksiniz: ");
		int counter = sc.nextInt();
		for(int i = 1; i <=counter; i++) {
			System.out.println(i + ". Sayı: ");
			num = sc.nextInt();
			if(i != 1 && num ==0) {
				System.out.println("Bölen için 0 değerini giremezsiniz: ");
				continue;
			}
			if(i == 1) {
				result = num;
				continue;
			}
			result /= num;
		}
		System.out.println("Sonuç : " + result);
	}
	
	 // Üs Alma İşlemi
	
	static void usAlma() {
		int base, usAlma, result =1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Taban değerini giriniz: ");
        base = sc.nextInt();
        System.out.print("Üs değerini giriniz: ");
        usAlma = sc.nextInt();
        for (int i = 1; i <= usAlma; i++) {
            result *= base;
        }
        System.out.println("Sonuç: " + result);
	}
	
	// Faktoriyel İşlemi
    static void faktoriyel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyel hesabı için sayı giriniz: ");
        int num = input.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }
    
 // Mod Alma İşlemi
    static void mod() {
        int result;
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayının modunu almak istiyorsunuz?: ");
        int num = input.nextInt();
        System.out.print("Hangi sayıya göre mod almak istiyorsunuz?: ");
        int modNum = input.nextInt();
        if (num == 0 && modNum == 0) {
            System.out.println("Lütfen geçerli değerler giriniz: ");
        } else {
            result = num % modNum;
            System.out.println("Sonuç: " + result);
        }
    }
    
    // Dikdörtgen alan ve çevre hesabı
    static void dikdortgen() {
        int uzunKenar, kısaKenar, cevre, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        uzunKenar = input.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        kısaKenar = input.nextInt();

        cevre = (uzunKenar * 2) + (kısaKenar * 2);
        alan = uzunKenar * kısaKenar;
        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secenek;
        System.out.println("-------------------------");
        String menu = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap\n";


        do {
            System.out.println("--------------------------");
            System.out.print(menu);
            System.out.println("--------------------------");
            System.out.println("----- HESAP MAKİNESİ -----");
            System.out.println("--------------------------");
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            secenek = input.nextInt();

            switch (secenek) {
                case 1:
                    artı();
                    break;

                case 2:
                    eksi();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usAlma();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                	dikdortgen();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir değer giriniz!");
            }

        } while (secenek != 0);

    }
}

