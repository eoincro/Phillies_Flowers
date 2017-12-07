package com.cit.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.cit.basepackage.entities.Orders;
public interface OrderRepo extends MongoRepository<Orders, Integer> {

}
