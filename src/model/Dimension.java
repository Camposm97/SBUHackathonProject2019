package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dimension implements Serializable {
	private static final double WASTE_PERCENT = 0.15;
	private double width, length;

	public Dimension(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double calcTotalSquareFoot() {
		return width * length * WASTE_PERCENT;
	}

	@Override
	public String toString() {
		return "Dimension [width=" + width + ", length=" + length + "]";
	}
}
