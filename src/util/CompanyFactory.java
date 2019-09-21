package util;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import model.Company;

public class CompanyFactory {
	private static final String COMPANY_NAMES = "companies";
	private List<String> names;
	
	public CompanyFactory() throws FileNotFoundException {
		names = new LinkedList<>();
		Scanner in = new Scanner(COMPANY_NAMES);
		while (in.hasNextLine())
			names.add(in.nextLine());
		in.close();
	}
	
	public Company emitCompany() {
		String name = names.get((int)(Math.random() * names.size()));
		Company c = new Company(name, "", UtilFactory.emitPhone());
		return c;
	}
}
