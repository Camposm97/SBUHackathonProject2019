package util;

import java.io.FileNotFoundException;

public class UserAccountFactory {
	private CustomerAccountFactory cusAcctFactory;
	
	
	public UserAccountFactory() throws FileNotFoundException {
		cusAcctFactory = new CustomerAccountFactory();
	}
}
