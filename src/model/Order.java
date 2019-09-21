package model;

public class Order {
	private WorkType typeOfWork;
	private Material material;
	private String price;
	private Customer cus;
	
	public Order(WorkType typeOfWork, Material material, String price, Customer cus) {
		this.typeOfWork = typeOfWork;
		this.material = material;
		this.price = price;
		this.cus = cus;
		
	}

	public WorkType getTypeOfWork() {
		return typeOfWork;
	}

	public void setTypeOfWork(WorkType typeOfWork) {
		this.typeOfWork = typeOfWork;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Customer getCus() {
		return cus;
	}

	public void setCus(Customer cus) {
		this.cus = cus;
	}
	
	
	
}
