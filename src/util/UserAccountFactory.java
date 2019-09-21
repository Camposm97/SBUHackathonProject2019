package util;

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
		switch (i) {
		case 0:
			return  cusAcctFactory.emitCusAcct();
		default:
			return coAcctFactory.emitCompAcct();
		}
	}
}
