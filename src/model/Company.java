package model;

import java.util.List;

public class Company {
	private String name;
	private List<MaterialCrate> materialList;
	private String email;
	private String phone;

	public Company(String name, List<MaterialCrate> materialList, String email, String phone) {
		super();
		this.name = name;
		this.materialList = materialList;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MaterialCrate> getMaterialList() {
		return materialList;
	}

	public void setMaterialList(List<MaterialCrate> materialList) {
		this.materialList = materialList;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
