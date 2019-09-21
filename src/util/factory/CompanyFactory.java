package util.factory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import model.Company;
import util.Util;

public class CompanyFactory {
	private static final String COMPANY_NAMES = "data/companyNames";
	private List<String> names;
	private MaterialCaseFactory matCases;
	
	public CompanyFactory() throws FileNotFoundException {
		names = new LinkedList<>();
		matCases = new MaterialCaseFactory();
		Scanner in = new Scanner(new File(COMPANY_NAMES));
		while (in.hasNextLine()) {
			String line = in.nextLine();
			names.add(line);
		}
		in.close();
	}
	
	public Company emitCompany() {
		String name = names.get((int)(Math.random() * names.size()));
		Company c = new Company(name, matCases.emitMaterialCases(), Util.emitCompEmail(name), Util.emitPhone());
		return c;
	}
}
