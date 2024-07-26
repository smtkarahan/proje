package Hesap;

public class Hesaplama {
	
	public class Toplama{
		public int toplamaYap(int a, int b) {
			return a+b;
		}
	}           //class Toplama

	public static void main(String[] args) {
		Hesaplama.Toplama ht  = new Hesaplama().new Toplama();
		int sonuc = ht.toplamaYap(3, 5);
		System.out.println("Sonuc = " + sonuc);

	}

}					//class Hesapla
