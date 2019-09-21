package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NameFactory {
	private static final String FIRST_NAMES = "firstNames";
	private static final String LAST_NAMES = "lastNames";
	private List<String> firstNames, lastNames;

	public NameFactory() throws FileNotFoundException {
		loadFirstNames();
		loadLastNames();
	}
	
	private void loadFirstNames() throws FileNotFoundException {
		firstNames = new LinkedList<>();
		Scanner in = new Scanner(new File(FIRST_NAMES));
		while (in.hasNextLine())
			firstNames.add(in.nextLine());
		in.close();
	}
	
	private void loadLastNames() throws FileNotFoundException {
		lastNames = new LinkedList<>();
		Scanner in = new Scanner(new File(LAST_NAMES));
		while (in.hasNextLine())
			lastNames.add(in.nextLine());
		in.close();
	}
}
