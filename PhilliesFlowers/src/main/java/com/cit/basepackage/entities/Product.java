package com.cit.basepackage.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	@Id
	private String productID;
	private int orderID;
	private int quantity;
	private int price;
	private String productName;

	public Product(int orderID, int quantity, int price, String productID, String productName) {
		this.orderID = orderID;
		this.quantity = quantity;
		this.price = price;
		this.productID = productID;
		this.productName = productName;
	}
	public Product()
	{
		
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
