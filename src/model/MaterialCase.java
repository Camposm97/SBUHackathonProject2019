package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MaterialCase implements Serializable {
	private Material mat;
	private double quantity;
	private double pricePerCase;
	
	public MaterialCase(Material mat, double quantity, double pricePerCase) {
		this.mat = mat;
		this.quantity = quantity;
		this.pricePerCase = pricePerCase;
	}
	
	public Material getMat() {
		return mat;
	}

	public void setMat(Material mat) {
		this.mat = mat;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double calcMatPrice() {
		return Math.ceil(quantity) * pricePerCase;
	}

	@Override
	public String toString() {
		return "MaterialCase [mat=" + mat + ", quantity=" + quantity + ", pricePerCase=" + pricePerCase + "]";
	}
}
