package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CompanyAccount extends UserAccount implements Serializable {	
	private Company c;
	
	public CompanyAccount(String username, String password, Company c) {
		super(username, password);
		this.c = c;
	}	
	
	public Company getC() {
		return c;
	}
	
	public void setC(Company c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "CompanyAccount [" + super.toString() + "c=" + c + "]";
	}
}
