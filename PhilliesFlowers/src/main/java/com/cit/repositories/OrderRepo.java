package com.cit.repositories;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cit.basepackage.entities.Orders;

public interface OrderRepo extends MongoRepository<Orders, Integer> {


	    
	    Orders findByOrderID(int orderID);
	    @Query("{Orders: { $regex: ?0 } })")
	    List<Orders> findCustomByRegExDomain(String findByOrderID);
	    

}
