package com.cit.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.cit.basepackage.entities.Customer;

public interface CustomerRepo extends MongoRepository<Customer, Integer>
{

	public List<Customer> findByName(String name);
}
