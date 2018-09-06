package com.capgemini.classes;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private String nameOfTheDepartment;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String name, double salary, String nameOfTheDepartment) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.nameOfTheDepartment = nameOfTheDepartment;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getNameOfTheDepartment() {
		return nameOfTheDepartment;
	}
	public void setNameOfTheDepartment(String nameOfTheDepartment) {
		this.nameOfTheDepartment = nameOfTheDepartment;
	}
	
	

}
