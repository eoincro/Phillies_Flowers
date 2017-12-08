package com.cit.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.cit.basepackage.entities.Product;


public interface ProductRepo extends MongoRepository<Product, Integer>{


}
