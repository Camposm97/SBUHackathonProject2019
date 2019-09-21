package util.factory;

import model.Order;
import model.WorkType;

public class OrderFactory {
	public OrderFactory() {
		
	}
	
	public WorkType emitWorkType() {
		return WorkType.values()[(int)(Math.random() * WorkType.values().length)];
	}
	
	public Order emitOrder() {
		return null;
//		Order order = new Order(emitWorkType());
	}
}
