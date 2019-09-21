package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MaterialCrate implements Serializable {
	private Material material;
	
	public MaterialCrate(Material material) {
		this.material = material;
	}
	
	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}



	public double getBoxPrice() {
		return 0.0;
	}
}
