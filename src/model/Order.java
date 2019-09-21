package model;

public class Order {
	private WorkType typeOfWork;
	private MaterialCase matCase;
	private Customer cus;
	
	public Order(WorkType typeOfWork, MaterialCase matCase, Customer cus) {
		this.typeOfWork = typeOfWork;
		this.matCase = matCase;
		this.cus = cus;
	}

	public WorkType getTypeOfWork() {
		return typeOfWork;
	}

	public void setTypeOfWork(WorkType typeOfWork) {
		this.typeOfWork = typeOfWork;
	}

	public MaterialCase getMatCase() {
		return matCase;
	}

	public void setMatCase(MaterialCase matCase) {
		this.matCase = matCase;
	}

	public Customer getCus() {
		return cus;
	}

	public void setCus(Customer cus) {
		this.cus = cus;
	}
	
	
	
}
