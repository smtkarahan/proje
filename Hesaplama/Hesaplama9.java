package Hesap;

abstract class BuyukToplayici{
	private int deger;
	public BuyukToplayici(int x) {
		deger = x;
	}
	
	public int degerDondur() {
		return deger;
	}
	public abstract int hesaplamaYap();				//İptal edilmesi gerek
}

public class Hesaplama9 {
	
	public BuyukToplayici degerGoster(int gonderilen) {
		return new BuyukToplayici(gonderilen) {
			public int hesaplamaYap() {				//iptal etti (override)
				return super.degerDondur() + 5;
			}
		};				//Noktalı virgül şart
	}//degerGoster(), yordam sonu

	public static void main(String[] args) {
		Hesaplama9 h9 = new Hesaplama9();
		BuyukToplayici bt = h9.degerGoster(5);
		int sonuc = bt.hesaplamaYap();
		System.out.println("Sonuc = " + sonuc ); 

	}

}
