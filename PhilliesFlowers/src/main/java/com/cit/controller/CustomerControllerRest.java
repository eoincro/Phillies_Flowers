package com.cit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cit.basepackage.entities.Customer;
import com.cit.repositories.CustomerRepo;

@RestController
public class CustomerControllerRest {

	@Autowired
	CustomerRepo customerRepo;

	@RequestMapping(path="/displayAllCustomers", method = RequestMethod.GET)
	public List<Customer> findByRepo()  {
		return customerRepo.findAll();
	}
	
}