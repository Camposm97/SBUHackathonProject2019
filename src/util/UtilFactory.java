package util;

import model.Name;

public class UtilFactory {
	public static void main(String[] args) {
		String s = emitCusEmail(new Name("Michael", "Campos"));
		System.out.println(s);
	}
	
	// For generating company emails (maybe)
	public static String emitEmail(String name) {
		String s = "";
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
		s += getDigits(10);
		s = s.substring(0, 10);
		return s;
	}
	
	public static String getDigits(int numberOfDigits) {
		String s = "";
		for(int i = 0; i < numberOfDigits; i++) {
			s += String.valueOf((int)(Math.random() * 9));
		}
		return s;
	}
}
