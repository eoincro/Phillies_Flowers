package com.cit.basepackage.entities;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Orders {
	@Id
	private int orderID;
	private int price;
	 ArrayList<Product> products;
	
	public Orders(int orderID, int price, ArrayList<Product> products) {
		super();
		this.orderID = orderID;
		this.price = price;
		this.products = products;
	}
	
	public Orders()
	{
		
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	
	
	
	private void increaseCost(int amount)
	{
		price +=amount;
	}
	private void decreaseCost(int amount)
	{
		price -=amount;
	}
	
	public void addProductOrder(Product p)
	{
		increaseCost(p.getPrice());
		this.products.add(p);
	}
	
	
}
