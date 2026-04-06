package com.test;

public class Employee {

	private int id;
	
	private String name;
	
	private String Company;
	
	public Employee() {
		
	}
	//CONSTRUCTOR INJECTION EXAMPLE
	public Employee(int id,String name, String Company) {
		
		this.id=id;
		this.name=name;
		this.Company=Company;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Company=" + Company + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}
}
