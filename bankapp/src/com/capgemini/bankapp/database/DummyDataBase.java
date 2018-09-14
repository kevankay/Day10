package com.capgemini.bankapp.database;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.model.Customer;

public class DummyDataBase {
	private static Set<Customer> customers = new HashSet<>();
	private static Set<BankAccount> bankAccounts = new HashSet<>();

	public DummyDataBase() {
		super();
	
	}
	static {
		BankAccount account1 = new BankAccount(12345, "SAVINGS", 50000);
		BankAccount account2 = new BankAccount(12346, "CURRENT", 40000);
		BankAccount account3 = new BankAccount(12347, "SAVINGS", 30000);
		bankAccounts.add(account1);
		bankAccounts.add(account2);
		bankAccounts.add(account3);
		
		Customer customer1 = new Customer(1,"Shiny","shiny1","shiny@gmail.com","Narasaraopet",LocalDate.of(1997,3,12),account1);
		Customer customer2 = new Customer(2,"Sam","sam2","sam@gmail.com","Mumbai",LocalDate.of(1954,3,12),account2);
		Customer customer3 = new Customer(3,"George","george3","george@gmail.com","Hyderabad",LocalDate.of(1930,3,12),account3);
		
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
	}

	public static Set<Customer> getCustomer() {
		return customers;
	}

	public static Set<BankAccount> getBankAccount() {
		return bankAccounts;
	}

	public static void setCustomers(Set<Customer> customers) {
		DummyDataBase.customers = customers;
	}

	public static void setBankAccounts(Set<BankAccount> bankAccounts) {
		DummyDataBase.bankAccounts = bankAccounts;
	}
}
