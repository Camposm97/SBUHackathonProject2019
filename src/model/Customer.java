package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Customer implements Serializable {
	private Name name;
	
	public Customer(Name name) {
		this.name = name;
	}
	
	public Name getName() {
		return name;
	}
}
