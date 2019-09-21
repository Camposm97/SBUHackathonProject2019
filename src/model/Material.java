package model;

public class Material {
	private String name;
	private Dimension dimensions;
	private double pricePerUnit;

	public Material(String name, Dimension dimensions, double pricePerUnit) {
		super();
		this.name = name;
		this.dimensions = dimensions;
		this.pricePerUnit = pricePerUnit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dimension getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double price) {
		this.pricePerUnit = price;
	}
}
