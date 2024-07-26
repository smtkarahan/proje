package Hesap;

interface Toplayicilarr{
	public int hesaplamaYap();
}

public class Deneme {

	
	public Toplayicilarr topla(final int a, final int b) {
		class BenimToplayicim implements Toplayicilarr{
			public int hesaplamaYap() {
				//final olan yerel degişkenlere ulaşabilir
				return a+b;
			}
		}//yordam sonu
		return new BenimToplayicim();
		
	}


	public static void main(String[] args) {
		Deneme d = new Deneme();
		Toplayicilarr t = d.topla(9, 7);
		int sonuc = t.hesaplamaYap();
		System.out.println("Sonuc =  9 + 7  = " + sonuc);

	}

}//class Hesaplama8
