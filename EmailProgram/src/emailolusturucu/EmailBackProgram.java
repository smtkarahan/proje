package emailolusturucu;

import java.util.Scanner;

public class EmailBackProgram {
	private String FirstName;
	private String LastName;
	private String Password;
	private String Department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "gmail.com";
	
	public EmailBackProgram(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		
		this.Department = setDepartment();
		
		this.Password = randomPassword(defaultPasswordLength);
		System.out.println("Şifreniz: " + this.Password);
		
		email = FirstName.toLowerCase() + "." + LastName.toLowerCase() + "@" + Department + "." + companySuffix;
	}
	
	private String setDepartment() {
		System.out.print("Hoşgeldin!! " + FirstName + "."+" Sen Yeni Çalışanımızsın." + " \nDepartman Kodlarını Seçin\n1 BilgiIslem\n2 Personel\n3 Memur\n0 Hiçbiri\nDepartman Kodunu Girin: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt(); 
		if(depChoice == 1) {return "BilgiIslem";}
		else if(depChoice == 2) {return "Personel";}
		else if(depChoice == 3) {return "Memur";}
		else {return "";}
	}
	
	
	private String randomPassword(int length) {
		String PasswordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*^";
		char [] Password = new char[length];
		for(int i = 0; i<length;i++) {
			int rand = (int)(Math.random()*PasswordSet.length());
			Password[i] = PasswordSet.charAt(rand);
		}
		return new String(Password);
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;	
	}
	
	public void changePassword(String Password) {
		this.Password = Password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return Password;}
	
	public String showInfo() {
		return "Ekran adı: " + FirstName + " " + LastName + 
				"\nŞirket E-postası: " + email + 
				"\nPosta Kutusu Kapasitesi: " + mailboxCapacity + "mb";
	}
}