package com.capgemini.employeeapp.model;

public class Employee {
	private int employeeId;
	private String emplyeeName;
	private double employeeSalary;
	private String employeeDepartment;

	public Employee() {
		super();
		
	}

	public Employee(int employeeId, String emplyeeName, double employeeSalary, String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.emplyeeName = emplyeeName;
		this.employeeSalary = employeeSalary;
		this.employeeDepartment = employeeDepartment;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmplyeeName() {
		return emplyeeName;
	}

	public void setEmplyeeName(String emplyeeName) {
		this.emplyeeName = emplyeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

}
