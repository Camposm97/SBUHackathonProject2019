package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerAccount extends UserAccount implements Serializable {
	private Customer cus;
	
	public CustomerAccount(String username, String password, Customer cus) {
		super(username, password);
		this.cus = cus;
	}

	public Customer getCus() {
		return cus;
	}

	public void setCus(Customer cus) {
		this.cus = cus;
	}
}
