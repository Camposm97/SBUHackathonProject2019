package util.factory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import model.Company;
import model.MaterialCase;
import util.Util;

public class CompanyFactory {
	private static final String COMPANY_NAMES = "data/companyNames";
	private List<String> names;
	private MaterialCaseFactory matCaseFactory;
	
	public CompanyFactory() throws FileNotFoundException {
		names = new LinkedList<>();
		matCaseFactory = new MaterialCaseFactory();
		Scanner in = new Scanner(new File(COMPANY_NAMES));
		while (in.hasNextLine()) {
			String line = in.nextLine();
			names.add(line);
		}
		in.close();
	}
	
	public Company emitCompany() {
		String name = names.get((int)(Math.random() * names.size()));
		List<MaterialCase> list = matCaseFactory.emitMaterialCases();
		System.out.println(list.get(0));
		Company c = new Company(name, list, Util.emitCompEmail(name), Util.emitPhone());
		return c;
	}
}
