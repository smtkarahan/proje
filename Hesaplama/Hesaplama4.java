package Hesap;

public class Hesaplama4 {
	
	int sabit = 2;
	private int ozelsabit =1;
	public static class Toplama4{				//Statik üye dahili sınıf
		static int toplam;						//Doğru
		int sonuc;								//Doğru
		public int toplamaYap(int a, int b) {
			//return (a+b) + sabit ;			//Hata..
			sonuc = toplam = a+b;
			return sonuc;
		}
		public void dekontOlustur() {
			/* -sabit-alana ve -ekranaBas() yordamınaulaşabilmek için
			 Hesaplama4 sınıfına ait nesne oluşturulması gerekir */
			Hesaplama4 hs4 = new Hesaplama4();	//Dikkat
			int a = hs4.ozelsabit;				//Doğru
			hs4.ekranaBas();					//Doğru
				System.out.println("Dekont olusturuluyor = " + hs4.sabit + " - " + a);
 		}
	}//class Toplama4
	
	public class Cikartma4{						//Üye dahili sınıf
		int sonuc;
		//static int sonuc1;					//Hata..
		public int cikartmaYap(int a, int b) {
			ekranaBas();						//Dikkat
			sonuc = (a-b)-ozelsabit;
			return sonuc;						//Dikkat
		} 
	}//class Cikartma4
	
	private void ekranaBas() { 
		System.out.println("Hesaplama4.ekranaBas()");
	}

	public static void main(String[] args) {
		//Hata
		//Hesaplama4.Toplama4 ht = new Hesaplama4().new Toplama4();
		Toplama4 tp4 = new Toplama4();
		tp4.dekontOlustur();
		int sonuc = tp4.toplamaYap(10, 5);
		System.out.println("Sonuc = 10 + 5 = " + sonuc);
		
	}
} //class Hesaplama4

class Hesaplama4Kullan{
	public static void main(String[] args) {
		//hata
		
		//Hesaplama4.Toplama4 ht = new Hesaplama4().new Toplama4();
		Hesaplama4.Toplama4  tp4 = new Hesaplama4.Toplama4();
		int sonuc = tp4.toplamaYap(10, 5);
		System.out.println("Sonuc = 10 + 5 = " + sonuc);
		
	}
}//class Hesaplama4Kullan

