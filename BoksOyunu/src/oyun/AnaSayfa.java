package oyun;

import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		dövüscü Ahmet = new dövüscü("Ahmet", 15,100,90,30,50);
		dövüscü Mehmet = new dövüscü("Mehmet", 20,90,100,30,50);
		
		mac r = new mac(Ahmet,Mehmet, 75, 100); 
		r.run();
		
	}

}
