package com.capgemini.bankapp.model;

import java.time.LocalDate;

public class Customer {
	private long customerId;
	private String customerName;
	private String customerPassword;
	private String customerEmailId;
	private String customerAddress;
	private LocalDate customerDob;
	private BankAccount customerAccount ;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long customerId, String customerName, String customerPassword, String customerEmailId,
			String customerAddress, LocalDate customerDob, BankAccount customerAccount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.customerEmailId = customerEmailId;
		this.customerAddress = customerAddress;
		this.customerDob = customerDob;
		this.customerAccount = customerAccount;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public LocalDate getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(LocalDate customerDob) {
		this.customerDob = customerDob;
	}
	public BankAccount getCustomerAccount() {
		return customerAccount;
	}
	public void setCustomerAccount(BankAccount customerAccount) {
		this.customerAccount = customerAccount;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPassword="
				+ customerPassword + ", customerEmailId=" + customerEmailId + ", customerAddress=" + customerAddress
				+ ", customerDob=" + customerDob + ", customerAccount=" + customerAccount + "]";
	}
	
}