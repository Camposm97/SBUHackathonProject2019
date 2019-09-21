package util;

public class PasswordUtil {
	public static String emitPassword() {
		final int length = 5;
		String chars = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
		String password = "";
		while (password.length() < length) {
			password += chars.charAt((int)(Math.random() * chars.length()));
		}
		return password;
	}
}
