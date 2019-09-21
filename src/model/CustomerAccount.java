package model;

public class CustomerAccount extends UserAccount {
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
