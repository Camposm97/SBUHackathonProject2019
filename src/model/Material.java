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

	public void setDim(Dimension dim) {
		this.dim = dim;
	}

	@Override
	public String toString() {
		return "Material [name=" + name + ", dim=" + dim + "]";
	}
}
