package util.factory;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

import model.Customer;
import model.Order;
import model.WorkType;

public class OrderFactory {
	private MaterialCaseFactory matCaseFactory;
	
	public OrderFactory() throws FileNotFoundException {
		matCaseFactory = new MaterialCaseFactory();
	}
	
	public WorkType emitWorkType() {
		return WorkType.values()[(int)(Math.random() * WorkType.values().length)];
	}
	
	public List<Order> emitOrderList(Customer cus) {
		List<Order> list = new LinkedList<>();
		int n = (int)(Math.random() * 20);
		for (int i = 0; i < n; i++) {
			list.add(emitOrder(cus));
		}
		return list;
	}
	
	public Order emitOrder(Customer cus) {
		Order order = new Order(emitWorkType(), 
				matCaseFactory.emitMaterialCase(), cus);
		return order;
	}
}
