package util.factory;

import java.io.FileNotFoundException;

import model.Order;
import model.WorkType;

public class OrderFactory {
	private MaterialCaseFactory matCaseFactory;
	private CustomerFactory cusFactory;
	
	public OrderFactory() throws FileNotFoundException {
		matCaseFactory = new MaterialCaseFactory();
	}
	
	public WorkType emitWorkType() {
		return WorkType.values()[(int)(Math.random() * WorkType.values().length)];
	}
	
	public Order emitOrder() {
		Order order = new Order(emitWorkType(), 
				matCaseFactory.emitMaterialCase(), cusFactory.emitCus());
		return order;
	}
}
