package com.cit.basepackage.entities;

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
	ProductRepo ProductRepo;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		customerRepo.save(new Customer(1,"eoin", "eoin@cit.ie", 2,"hello"));
		customerRepo.save(new Customer(2,"tim", "tim@cit.ie", 2,"hello"));
		orderRepo.save(new Orders(1,1, 20, 2));
		ProductRepo.save(new Product(1,1, 2, 20,"Rose"));		
	}

}
