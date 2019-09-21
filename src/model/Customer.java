package model;

import java.io.Serializable;
import java.util.LinkedList;

@SuppressWarnings("serial")
public class Customer implements Serializable {
	private Name name;
	private LinkedList<Order> orderList;
	
	public Customer(Name name) {
		this.name = name;
		this.orderList = new LinkedList<>();
	}
	
	public Name getName() {
		return name;
	}
	
	public LinkedList<Order> getOrders() {
		return orderList;
	}
}
