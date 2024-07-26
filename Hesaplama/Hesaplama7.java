package Hesap;

public class Hesaplama7 {
	
	public static int topla(int a, final int b) {
		int a_yedek = a;
		class Toplama7{
			private int x;
			public int y;
			//protected int z = a_yedek;
			int p;
			public int degerDondur() {
				//int degera = a;
				int degerb = b;
				return b ;
			}
		}
		Toplama7 t7 = new Toplama7();
		return t7.degerDondur();
	}
	public void ekranaBas() {
		/*
		  Yerel sınıflar yalnızca friendly erişim belirleyicisine sahip olabilirler
		  
		  public class Toplama8{
		  public void test(){ }
		  }		  
		 */
	}
	
	public void hesaplamaYap() {
		/*
		 Yerel sınıflar yalnızca friendly erişim belirleyicisine sahip olabilirler
		 
		 static class Toplama9{
		 public void abcd(){ }
		 }
		 
		 */
	}

	public static void main(String[] args) {
		
		int sonuc = Hesaplama7.topla(8, 9);
		System.out.println("Sonuc  " + sonuc);

	}

}
