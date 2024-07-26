package Hesap;

interface Toplayicilar{
	public int hesaplamaYap();
}

public class Hesaplama8 {
	
	public Toplayicilar topla(final int a, final int b) {
		return new Toplayicilar() { 
			public int hesaplamaYap() {
				//final olan yerel degişkenlere ulaşabilir
				return a+b;
			}
		};
	}// topla() yordam sonu

	public static void main(String[] args) {
		Hesaplama8 h8 = new Hesaplama8();
		Toplayicilar t = h8.topla(9, 7);
		int sonuc = t.hesaplamaYap();
		System.out.println("Sonuc =  9 + 7  = " + sonuc);

	}

}//class Hesaplama8
