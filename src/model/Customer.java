package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Customer implements Serializable {
	private Name name;
//	private LinkedList<Order> orders;
	
	public Customer(Name name) {
		this.name = name;
	}
	
	public Name getName() {
		return name;
	}
	
//	public LinkedList<Order> getOrders() {
//		return orders;
//	}
}
