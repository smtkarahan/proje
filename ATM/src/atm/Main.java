package atm;

import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
		 String KullaniciAdi, sifre;
		 Scanner input = new Scanner(System.in);
		 int right = 4;
		 int balance = 2000;
		 int select;
		 
		 while(right > 0) {
			 System.out.println("Kullanici Adiniz : ");
			 KullaniciAdi = input.nextLine();
			 System.out.println("Sifrenizi Giriniz : ");
			 sifre = input.nextLine();
			 
			 if (KullaniciAdi.equals("smtkrhn") && sifre.equals("1357") ) {
				 System.out.println("Hoşgeldiniz Ziraat ATM'sine ");
				 do {
					 System.out.println("----------------------");
					 System.out.println( "1-Para yatırma\n " +  "2-Para Çekme\n" +  "3-Bakiye Sorgula\n" +  "4-Çıkış Yap");
					 System.out.println("----------------------");
					 System.out.println("Lütfen Yapmak istediginiz işlemi seçiniz : ");
					 select = input.nextInt();
					 System.out.println("----------------------");
					 
					 switch(select) {
					 case 1:
						 System.out.println("Yatırmak istediginiz miktar : ");
						 int price =input.nextInt();
						 balance += price;
						 break;
					 case 2: 
						 System.out.println("Cekmek istediginiz miktar : ");
						 int decrease  =input.nextInt();
						 if( decrease  > balance) {
							 System.out.println("Yetersiz bakiye!");
						 }else {
							 balance -= decrease ;
						 }
						 break;
						 
					 case 3: 
						 System.out.println("Bakiyeniz : " + balance);
						 break;
					 }
				 } while(select !=4);
				 System.out.println("Tekrar Görüşmek üzere.");
				 break;
			 }
			 else {
				 right--;
				 System.out.println("Hatalı kullanici adi veya sifre. Tekrar Deneyiniz.");
				 if(right == 0) {
					 System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
				 }else {
					 System.out.println("Kalan Hakkınız : " + right);
					 
				 }
			 }
		 }
	 }
}


