package Hesap;

interface Toplayici{
	public int hesaplamaYap();
}

public class Hesaplama6 {
	
	public int topla(int a, int b) {
		class Toplama6 implements Toplayici{
			private int deger1;
			private int deger2;
			public Toplama6(int deger1, int deger2) {	//Yapılandırıcı
				this.deger1 = deger1;
				this.deger2 = deger2;
			}
			public int hesaplamaYap() {					//iptal etti
				return deger1+deger2;
			}
		}//class Toplama6
		
		Toplama6 t6 = new Toplama6(a,b);
		return t6.hesaplamaYap();
 	}
	public void ekranaBas() {
		// Toplama6 t6 = new Toplama6(2,6,);			//Hata kapsama alanının dışında
	}

	public static void main(String[] args) {
		Hesaplama6 h6 = new Hesaplama6();
		int sonuc = h6.topla(5, 9);
		System.out.println("Sonuc 5 + 9 = " + sonuc);

	}

}//class Hesaplama6 
