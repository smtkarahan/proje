package oyun;

public class dövüscü {
	
	String Isim;
	int hasar;
	int saglık;
	int agirlik;
	int atlatmak;
	int IlkVurus;
	
	//yapılandırıcı
	
	dövüscü(String Isim, int hasar, int saglık, int agirlik, int atlatmak, int IlkVurus){
		this.Isim = Isim;
		this.hasar = hasar;
		this.saglık = saglık;
		this.agirlik = agirlik;
		if( atlatmak >= 0 && atlatmak <=100) {
			this.atlatmak =atlatmak;
		}else {
			this.atlatmak = 0;
		}
		if( IlkVurus >=0 && IlkVurus <= 100 ) {
			this.IlkVurus = IlkVurus;
		}else {
			this.IlkVurus =0;
		}	
	}
	
	// Metodlar
	
	int vurmak (dövüscü dusman) {
		System.out.println(this.Isim +" => " + dusman.Isim + " " + this.hasar + " hasar verildi");
		if(dusman.isatlatmak()) {
			System.out.println("--------------------");
			System.out.println(dusman.Isim + " gelen hasarı blokladı");
			return dusman.saglık;
		}
		if( dusman.saglık - this.hasar < 0 ) {
			return 0;
		}
		return dusman.saglık - this.hasar ;
	}
	boolean isatlatmak() {
		double randomNumber = Math.random()*100;
		return randomNumber <= this.atlatmak;
	}
	boolean isIlkVurus() {
		double randomNumber = Math.random()*100;
		return randomNumber <= this.IlkVurus;
	}

}
