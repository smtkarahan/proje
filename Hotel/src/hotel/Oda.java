package hotel;

public class Oda {

    private String OdaNumarası;
    private double Fatura;
    private final int MusteriSayisi;


    public enum Durum {
        Mevcut,
        UygunDegil
    }
    Durum S;

    public enum Türler {
        KingSüit,
        YatakOdası2,
        YatakOdası3,
        YatakOdası4,
        EkonomikOda

    };
    Türler type;
    Musteri[] musteriler;

    public Oda(String OdaNumarası, double Fatura, int MusteriSayisi, Türler type) {
        this.OdaNumarası = OdaNumarası;
        this.Fatura = Fatura;
        this.MusteriSayisi = MusteriSayisi;
        this.type = type;
        musteriler = new Musteri[MusteriSayisi];
        for (int i = 0; i < MusteriSayisi; i++) {
            musteriler[i] = new Musteri();
        }
        this.S = Durum.Mevcut;
    }

     public int getMusteriSayisi() {
        return MusteriSayisi;
    }
     
    public Durum getS() {
        return S;
    }

    public void setS(Durum S) {
        this.S = S;
    }

    public Musteri[] getmusteriler() {
        return musteriler;
    }

    public void setmusteriler(Musteri[] musteriler) {
        this.musteriler = musteriler;
    }

    public String getOdaNumarası() {
        return OdaNumarası;
    }

    public void setOdaNumarası(String OdaNumarası) {
        this.OdaNumarası = OdaNumarası;
    }

    public double getFatura() {
        return Fatura;
    }

    public void setFatura(double Fatura) {
        this.Fatura = Fatura;
    }

    public Türler getType() {
        return type;
    }

    public void setType(Türler type) {
        this.type = type;
    }

    public void Görüntülemek() {
        System.out.println("Oda " + OdaNumarası + " Oda Type: " + type + " Durum: " + S + " Fatura: " + Fatura);

    }

    public void DisplayCutomers() {
        for (Musteri c1 : musteriler) {
           c1.Görüntülemek();
            
        }

    }

	public void setFatura(int fatura) {
		// TODO Auto-generated method stub
		
	}

	public void setCustomers(Musteri[] odaMates) {
		// TODO Auto-generated method stub
		
	}

	public void setBill(int bill) {
		// TODO Auto-generated method stub
		
	}
}