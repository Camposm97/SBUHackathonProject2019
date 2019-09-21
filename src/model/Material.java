package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Material implements Serializable {
	private String name;
	private Dimension dim;

	public Material(String name, Dimension dim) {
		super();
		this.name = name;
		this.dim = dim;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dimension getDim() {
		return dim;
	}
}
