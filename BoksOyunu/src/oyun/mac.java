package oyun;

public class mac {
	dövüscü d1;
	dövüscü d2;
	int enazAgirlik;
	int enfazlaAgirlik;
	
	mac(dövüscü d1, dövüscü d2, int enazAgirlik, int enfazlaAgirlik){ 
		this.d1 = d1;
		this.d2 = d2;
		this.enazAgirlik = enazAgirlik;
		this.enfazlaAgirlik = enfazlaAgirlik;
	}
	
	void run() {
		if(isKontrolEt() ) {
			while (this.d1.saglık > 0 && this.d2.saglık > 0) {
				System.out.println("==== Yeni Round ====");
				if (this.d1.isIlkVurus()) {
					this.d2.saglık = this.d1.vurmak(d2);
					if (isKazanmak())
						break;
				}
				if (this.d2.isIlkVurus()) {
					this.d1.saglık = this.d2.vurmak(d1);
					if (isKazanmak())
						break;
				}
				System.out.println(this.d1.Isim + "Sağlık" + this.d1.saglık);
				System.out.println(this.d2.Isim + "Sağlık" + this.d2.saglık);
			}
		} else {
			System.out.println("Siklet Uyumsuzluğu.");
		}
	}
	
	boolean isKontrolEt() {
		return (this.d1.agirlik >= enazAgirlik && this.d1.agirlik <=enfazlaAgirlik) && (this.d2.agirlik >= enazAgirlik && this.d2.agirlik <=enfazlaAgirlik);
	}
	
	boolean isKazanmak() {
		if(this.d1.saglık == 0) {
			System.out.println(this.d2.Isim + "Kazandı");
			return true;
		}
		if (this.d2.saglık == 0) {
			System.out.println(this.d1.Isim + "Kazandı");
			return true;
		}
		return false;
	}
	

}
