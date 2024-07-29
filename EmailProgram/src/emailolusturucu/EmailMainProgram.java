 package emailolusturucu;

 public class EmailMainProgram {

		public static void main(String[] args) {
			EmailBackProgram email = new EmailBackProgram("Samet", "Karahan");
			System.out.println(email.showInfo());

		}

	}