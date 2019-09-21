package model;

public class Orders {

	private String typeOfWork;
	private String material;
	private String price;
	private String nameOfCustomer;
	
	public Orders(String typeOfWork, String material, String price, String nameOfCustomer) {
		this.typeOfWork = typeOfWork;
		this.material = material;
		this.price = price;
		this.nameOfCustomer = nameOfCustomer;
		
	}

	public String getTypeOfWork() {
		return typeOfWork;
	}

	public void setTypeOfWork(String typeOfWork) {
		this.typeOfWork = typeOfWork;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNameOfCustomer() {
		return nameOfCustomer;
	}

	public void setNameOfCustomer(String nameOfCustomer) {
		this.nameOfCustomer = nameOfCustomer;
	}
	
	
	
}
