package model;

public class CompanyAccount extends UserAccount {	
	private Company c;
	
	public CompanyAccount() {
		
	}
	
	public Company getC() {
		return c;
	}
	
	public void setC(Company c) {
		this.c = c;
	}
}
