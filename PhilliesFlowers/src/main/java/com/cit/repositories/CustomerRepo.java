package com.cit.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.cit.basepackage.entities.Customer;


public interface CustomerRepo extends MongoRepository<Customer, Integer>
{
	public Customer findByCustomerID(int CustomerID);
	
	public Customer findByName(String name);
	
	public List<Customer> findAll();
}
