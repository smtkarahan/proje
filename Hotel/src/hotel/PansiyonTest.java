package hotel;

import java.util.Scanner;

public class PansiyonTest {

    /**
     @param  komut satırı argümanlarını tartışıyor
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pansiyon h1 = new Pansiyon("KARAHAN", 10);
        System.out.println("Otele Hoş Geldiniz " + h1.getPansiyonAdi());
        boolean flag = true;
        
        while (flag) {
            System.out.println("1 Oda Kiralamak");
            System.out.println("2 Müşteri Listesine");
            System.out.println("3 Odaları Görmek İçin");
            System.out.println("4 Odanıza Bir Şey Sipariş Etmek");
            System.out.println("5 Hostelden Ayrılmak");
            System.out.println("6 Çıkış");
            int Choice = h1.GetInteger(5);
            switch (Choice) {
                case 1:
                    h1.CutomerEnterence();
                    break;
                case 2:
                    h1.DisplayCustomers();
                    break;
                case 3:
                    h1.DisplayRooms();
                    break;
                case 4:
                    h1.Order();
                    break;
                case 5:
                    h1.CustomerLeaves();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Yanlış! Seçim 1-5 Aras1ında Olmalı");
            }
        }
    }
}
