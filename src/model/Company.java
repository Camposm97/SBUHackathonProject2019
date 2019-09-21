package model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
public class Company implements Serializable {
	private String name;
	private List<MaterialCase> materialList;
	private String email;
	private String phone;

	public Company(String name, List<MaterialCase> materialList, String email, String phone) {
		this.name = name;
		this.materialList = materialList;
		this.email = email;
		this.phone = phone;
	}
	
	public Company(String name, String email, String phone) {
		this.name = name;
		this.materialList = new LinkedList<>();
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MaterialCase> getMaterialList() {
		return materialList;
	}

	public void setMaterialList(List<MaterialCase> materialList) {
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

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}
}
