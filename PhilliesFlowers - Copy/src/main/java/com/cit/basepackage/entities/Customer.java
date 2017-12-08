package com.cit.basepackage.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	@Id
	int customerId;
	String name;
	String email;
	int orderID;
	String Password;

	public Customer(int id, String name, String email, int orderID, String Password) 
	{
		this.customerId = id;
		this.name = name;
		this.email = email;
		this.orderID = orderID;
		this.Password = Password;
	}
	public Customer() 
	{

	}

	public int getId() {
		return customerId;
	}

	public void setId(int customerId) {
		this.customerId = customerId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
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
