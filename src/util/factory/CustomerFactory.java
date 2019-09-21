package util.factory;

import java.io.FileNotFoundException;
import java.util.List;

import model.Customer;
import model.Name;
import model.Order;

public class CustomerFactory {
	private NameFactory nameFactory;
	private OrderFactory orderFac;
	
	public CustomerFactory() throws FileNotFoundException {
		nameFactory = new NameFactory();
		orderFac = new OrderFactory();
	}
	
	public Customer emitCus() {
		Name name = nameFactory.emitName();
		Customer cus = new Customer(name);
		List<Order> orderList = orderFac.emitOrderList(cus);
		cus.setOrderList(orderList);
		return cus;
	}
}
