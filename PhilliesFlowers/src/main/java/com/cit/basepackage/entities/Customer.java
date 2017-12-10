package com.cit.basepackage.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	@Id
	int customerID;
	String name;
	String email;
	int orderID;
	String password;

	public Customer(int customerID, String name, String email, int orderID, String password) 
	{
		this.customerID = customerID;
		this.name = name;
		this.email = email;
		this.orderID = orderID;
		this.password = password;
	}
	public Customer() 
	{

	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
