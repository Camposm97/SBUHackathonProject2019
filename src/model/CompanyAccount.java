package model;

public class CompanyAccount extends UserAccount {	
	private Company c;
	
	public CompanyAccount(String username, String password, Company c) {
		super(username, password);
	}	
	
	public Company getC() {
		return c;
	}
	
	public void setC(Company c) {
		this.c = c;
	}
}
