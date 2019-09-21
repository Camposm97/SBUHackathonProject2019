package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import model.Name;

public class NameFactory {
	private static final String FIRST_NAMES = "data/firstNames";
	private static final String LAST_NAMES = "data/lastNames";
	private List<String> firstNames, lastNames;

	public NameFactory() throws FileNotFoundException {
		loadFirstNames();
		loadLastNames();
	}
	
	public Name emitName() {
		return new Name(emitFirst(), emitLast());
	}
	
	public String emitFirst() {
		return firstNames.get((int)(Math.random() * firstNames.size()));
	}
	
	public String emitLast() {
		return lastNames.get((int)(Math.random() * lastNames.size()));
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
