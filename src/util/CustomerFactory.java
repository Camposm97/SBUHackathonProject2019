package util;

import java.io.FileNotFoundException;

import model.Customer;

public class CustomerFactory {
	private NameFactory nameFactory;
	
	public CustomerFactory() throws FileNotFoundException {
		nameFactory = new NameFactory();
	}
	
	public Customer emitCus() {
		Customer cus = new Customer(nameFactory.emitName());
		return cus;
	}
}
