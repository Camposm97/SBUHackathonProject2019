package util.factory;

import java.io.FileNotFoundException;

import model.Customer;
import model.CustomerAccount;
import util.PasswordUtil;
import util.Util;

public class CustomerAccountFactory {
	private CustomerFactory cusFactory;

	public CustomerAccountFactory() throws FileNotFoundException {
		cusFactory = new CustomerFactory();
	}

	public CustomerAccount emitCusAcct() {
		Customer cus = cusFactory.emitCus();
		CustomerAccount cusAcct = new CustomerAccount(Util.emitUsername(cus.getName()), 
				PasswordUtil.emitPassword(), cus);
		char c = Character.toLowerCase(cus.getName().getFirstName().charAt(0));
		cusAcct.setImageUrl(c + ".png");
		return cusAcct;
	}
}
