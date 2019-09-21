package util;

import java.io.FileNotFoundException;

import model.Company;
import model.CompanyAccount;

public class CompanyAccountFactory {
	private CompanyFactory cf;
	
	public CompanyAccountFactory() throws FileNotFoundException {
		cf = new CompanyFactory();
	}
	
	public CompanyAccount emitCompAcct() {
		Company c = cf.emitCompany();
		CompanyAccount compAcct = new CompanyAccount(Util.emitCoUser(c), Util.emitPassword(), c);
		return compAcct;
	}
}
