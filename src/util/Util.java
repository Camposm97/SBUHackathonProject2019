package util;

import model.Company;
import model.Name;

public class Util {
	public static String emitUsername(Name name) {
		String s = partLastName(name.getLastName());
		s += name.getFirstName().charAt(0);
		s += emitDigits(2);
		return s;
	}
	
	public static String emitCoUser(Company c) {
		String s = partLastName(c.getName());
		s += emitDigits(2);
		return s;
	}
	
	public static String partLastName(String lastName) {
		String username;
		if (isFourChar(lastName))
			username = lastName.substring(0, 4);
		else
			username = lastName;
		return username;
	}
	
	public static boolean isFourChar(String lastName) {
		return lastName.length() >= 4;
	}
	
	public static String emitPassword() {
		final int length = 5;
		String chars = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
		String password = "";
		while (password.length() < length) {
			password += chars.charAt((int)(Math.random() * chars.length()));
		}
		return password;
	}
	
	// For generating company emails (maybe)
	public static String emitCompEmail(String name) {
		String s = name.toLowerCase().substring(0, 5) + "@gmail.com";
		return s;
	}
	
	public static String emitCusEmail(Name name) {
		String s = name.getLastName();
		s += name.getFirstName().charAt(0);
		s += "@gmail.com";
		return s.toLowerCase();
	}
	
	public static String emitPhone() {
		String s = "";
		switch((int)(Math.random() * 5)) {
		case 0:
			s = "516";
			break;
		case 1:
			s = "631";
			break;
		case 2:
			s = "718";
		case 3:
			s = "212";
			break;
		case 4:
			s = "646";
		}
		s += emitDigits(10);
		s = s.substring(0, 10);
		return s;
	}
	
	public static String emitDigits(int numberOfDigits) {
		String s = "";
		for(int i = 0; i < numberOfDigits; i++) {
			s += String.valueOf((int)(Math.random() * 9));
		}
		return s;
	}
}
