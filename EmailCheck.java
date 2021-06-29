package Academia;

import java.util.regex.Pattern;

public class EmailCheck {

	public static boolean isValid(String email) {

		String emailFormat = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\."
				+ "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

		Pattern p = Pattern.compile(emailFormat);

		if (email == null) {
			return false;
		}
		return p.matcher(email).matches();
	}
}