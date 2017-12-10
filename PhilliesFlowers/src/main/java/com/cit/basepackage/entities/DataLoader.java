package com.cit.basepackage.entities;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.cit.repositories.CustomerRepo;
import com.cit.repositories.OrderRepo;
import com.cit.repositories.ProductRepo;

//ApplicationRunner is run before after the beans have been created and the application
//context has been completed.
//@Component makes it a bean so it is "seen" by Spring
@Component // ensures this is run because it is a bean
public class DataLoader implements ApplicationRunner{
	@Autowired // Find a PersonRepo bean and autowire it into personRepo
	CustomerRepo customerRepo;
	@Autowired
	OrderRepo orderRepo;
	@Autowired
	ProductRepo productRepo;

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		
//		orderRepo.save(new Orders(1,1, 20, 2));
//		productRepo.save(new Product(1,1, 2, 20,"Rose"));		
//		customerRepo.save(new Customer(1,"Eoin", "eoin@cit.ie", 2,"hello"));
//		customerRepo.save(new Customer(2,"Tim", "tim@cit.ie", 2,"hello"));
//		customerRepo.save(new Customer(0,"Frank", "frank@cit.ie", 2,"hello"));

		  Customer c = new Customer();
		  c.setCustomerID(1);
		  c.setOrderID(1);
		  c.setName("eoin");
		  c.setEmail("eoin@cit.ie");
		  c.setPassword("hello");
		  customerRepo.save( c );
		  
		  Product p = new Product();
		  p.setProductID("1");
		  p.setOrderID(1);
		  p.setPrice(30);
		  p.setProductName("Rose");
		  p.setQuantity(0);
		  productRepo.save( p );
		  
		 
		  Orders o = new Orders();
		  o.setOrderID(1);
		  o.setPrice(2);
		  o.products = new ArrayList<Product>();
		  o.products.add(p);
		  orderRepo.save(o);
		  
	
	}

}
