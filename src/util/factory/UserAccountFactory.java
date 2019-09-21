package util.factory;

import java.io.FileNotFoundException;

import model.UserAccount;

public class UserAccountFactory {
	private CustomerAccountFactory cusAcctFactory;
	private CompanyAccountFactory coAcctFactory;
	
	
	public UserAccountFactory() throws FileNotFoundException {
		cusAcctFactory = new CustomerAccountFactory();
		coAcctFactory = new CompanyAccountFactory();
	}
	
	public UserAccount emitAcct() {
		int i = (int) (Math.random() * 2);
		if (i == 0) {
			return cusAcctFactory.emitCusAcct();
		}
		return coAcctFactory.emitCoAcct();
	}
}
