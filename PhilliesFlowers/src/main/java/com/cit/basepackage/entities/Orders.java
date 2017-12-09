package com.cit.basepackage.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Orders {
	@Id
	int orderID;
	int quantity;
	int price;
	int productID;


	public Orders(int orderID, int quantity, int price, int productID) {
		super();
		this.orderID = orderID;
		this.quantity = quantity;
		this.price = price;
		this.productID = productID;
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
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}

}
