package hotel;

public class Musteri {

   private String İsim = "";
   private String Soyisim = "";
   private String Meslek = "";
   private int Yas = 0;

   public enum Son {
       BAY,
       BAYAN
   };
   Son son;

   public Musteri() {

   }

   public Musteri(String İsim, String Soyisim, String Meslek, int Yas, Son son) {
       this.İsim = İsim;
       this.Soyisim = Soyisim;
       this.Meslek = Meslek;
       this.Yas = Yas;
       this.son = son;
   }

   public String getİsim() {
       return İsim;
   }

   public void setİsim(String İsim) {
       this.İsim = İsim;
   }

   public String getSoyisim() {
       return Soyisim;
   }

   public void setSoyisim(String Soyisim) {
       this.Soyisim = Soyisim;
   }

   public String getMeslek() {
       return Meslek;
   }

   public void setMeslek(String Meslek) {
       this.Meslek = Meslek;
   }

   public int getYas() {
       return Yas;
   }

   public void setYas(int Yas) {
       this.Yas = Yas;
   }

   public Son getSon() {
       return son;
   }

   public void setSon(Son son) {
       this.son = son;
   }

   public void Görüntülemek() {
       if (this.Yas != 0) {
           System.out.println("İsim: " + İsim + " Soyisim: " + Soyisim + " Meslek: " + Meslek + " Yas: " + Yas + " Son: " + son);
           
   }
}

public int getYas1() {
	// TODO Auto-generated method stub
	return 0;
}
}