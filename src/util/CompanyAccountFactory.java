package util;

import java.io.FileNotFoundException;

import model.Company;
import model.CompanyAccount;

public class CompanyAccountFactory {
	private CompanyFactory cf;
	
	public CompanyAccountFactory() throws FileNotFoundException {
		cf = new CompanyFactory();
	}
	
	public CompanyAccount emitCoAcct() {
		Company c = cf.emitCompany();
		CompanyAccount coAcct = new CompanyAccount(Util.emitCoUser(c), PasswordUtil.emitPassword(), c);
		char ch = Character.toLowerCase((c.getName().charAt(0)));
		coAcct.setImageUrl(ch + ".png");
		return coAcct;
	}
}
