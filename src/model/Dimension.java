package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dimension implements Serializable {
	private double width, height, length;

	public Dimension(double width, double height, double length) {
		super();
		this.width = width;
		this.height = height;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
