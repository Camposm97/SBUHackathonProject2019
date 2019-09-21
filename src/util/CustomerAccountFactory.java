package util;

import java.io.FileNotFoundException;

import model.Customer;
import model.CustomerAccount;

public class CustomerAccountFactory {
	private CustomerFactory cusFactory;
	
	public CustomerAccountFactory() throws FileNotFoundException {
		cusFactory = new CustomerFactory();
	}
	
	public CustomerAccount emitCusAcct() {
		Customer cus = cusFactory.emitCus();
		CustomerAccount cusAcct = new CustomerAccount(Util.emitUsername(cus.getName()), Util.emitPassword(), cus);
		return cusAcct;
	}
}
