package stepik;

public class EmailAddressValidator {

	public static void main(String[] args) {

		if (args != null && args.length > 0) {

			for (int i = 0; i < args.length; i++) {
				String msg = "";
				if (args[i].matches("^(.+)@(\\S+)$")) {
					msg = String.format("%s valid email address", args[i]);
				} else {
					msg = String.format("%s invalid email address", args[i]);
				}
				System.out.println(msg);
			}
		} else {
			System.err.println("No input");
		}

	}

}
