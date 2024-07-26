package Hesap;

public class Hesaplama3 {
	
	private int sabit1 = 2;
	private static int sabit2 = 1;
	
	public class Toplama3{			//Üye dahili sınıf
		public int toplamaYap(int a, int b) {
			return (a+b) + sabit1;			//Dikkat
		}
	}//class Toplama3
	
	public class Cikartma3 {		//Üye dahili sınıf
		public int cikartmaYap(int a, int b) {
			dekontBilgileriGoster();		//Dikkat
			return (a-b) - sabit2;			//Dikkat
		}
	}//class Cikartma3
	
	private void dekontBilgileriGoster() {
		System.out.println("Dekont Bilgileri Gösteriliyor");
	}
	
	public void ekranaBas(int a, int b) {
		int sonuc =  new Toplama3().toplamaYap(a, b);
		System.out.println("Sonuc = " + a +" + " + b + " + sabit1 = " + sonuc);
		
	}

	public static void main(String[] args) {
		
		Hesaplama3 h3 = new Hesaplama3();
		h3.ekranaBas(10, 5);
		
		//Toplama İşlemi
		Hesaplama3.Toplama3 ht3 = h3.new Toplama3();
		int sonuc = ht3.toplamaYap(11, 6);
		System.out.println("Sonuc = 11 + 6 + sabit1 = " + sonuc);
		
		//Çıkartma İşlemi
		Hesaplama3.Cikartma3 hc3 = h3.new Cikartma3();
		int sonuc1 = hc3.cikartmaYap(10, 5);
		System.out.println("Sonuc = 10 - 5 - sabit2 = " + sonuc1);

	}

}// class Hesaplama3
