package com.capgemini.bankapp.dao.impl;

import java.util.Set;

import com.capgemini.bankapp.dao.CustomerDao;
import com.capgemini.bankapp.database.DummyDataBase;
import com.capgemini.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	Set<Customer> customers = DummyDataBase.getCustomer();

	@Override
	public Customer authenticate(Customer customer) {
		for (Customer c : customers) {
			if (c.getCustomerId()==customer.getCustomerId()) {
				System.out.println(c);
				if (c.getCustomerPassword().equals(customer.getCustomerPassword())) {
					return c;
				}
			}
		}
		return null;
	}

	@Override
	public Customer updateProfile(Customer customer) {
	
		for (Customer c : customers) {
			if (c.getCustomerId()==customer.getCustomerId()) {
				if (c.getCustomerPassword().equals(customer.getCustomerPassword())) {
					c.setCustomerName(customer.getCustomerName());
					c.setCustomerId(customer.getCustomerId());
					c.setCustomerEmailId(customer.getCustomerEmailId());
					c.setCustomerAddress(customer.getCustomerAddress());
					c.setCustomerDob(customer.getCustomerDob());
					return c;
				}
			}
		}
		return null;
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
		
		for (Customer c : customers) {
			if (c.getCustomerId()==customer.getCustomerId()) {
				if (c.getCustomerPassword() == oldPassword) {
					c.setCustomerPassword(newPassword);
					return true;
				}
			}
		}
		return false;
	}
}