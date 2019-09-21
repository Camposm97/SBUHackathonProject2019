package model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
public class Customer implements Serializable {
	private Name name;
	private List<Order> orderList;
	
	public Customer(Name name) {
		this.name = name;
		this.orderList = new LinkedList<>();
	}
	
	public Customer(Name name, List<Order> orderList) {
		this.name = name;
		this.orderList = orderList;
	}
	
	public Name getName() {
		return name;
	}
	
	public List<Order> getOrderList() {
		return orderList;
	}
	
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
}
