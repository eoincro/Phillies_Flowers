package com.cit.test.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.cit.repositories.CustomerRepo;
import com.cit.repositories.ProductRepo;
import com.cit.basepackage.entities.Customer;
import com.cit.basepackage.entities.Product;

@RunWith(MockitoJUnitRunner.class)
public class junitTesting {
	@Mock
    private ProductRepo productRepo;
    @Mock
    private CustomerRepo  customerRepo;
    
    @Test
    public void findAll() 
    {
 
        // Expected objects
        List<Product> expectedProductList = productRepo.findAll();
 
        // Mockito expectations                            
        when(productRepo.findAll()).thenReturn(expectedProductList);
 
        // Execute the method being tested     
        List<Product> newProductList = productRepo.findAll();
 
        // Validation  
        assertNotNull(newProductList);
        assertEquals(expectedProductList,newProductList);
    }
    
    @Test
    public void findByName() {
 
        // Expected objects
        Customer expectedCustomer = new Customer();
        expectedCustomer.setCustomerID(1);
        expectedCustomer.setOrderID(1);
        expectedCustomer.setName("eoin");
        expectedCustomer.setEmail("eoin@cit.ie");
        expectedCustomer.setPassword("hello");
        
    	
        // Mockito expectations                            
        when(customerRepo.findByName("eoin")).thenReturn(expectedCustomer);
 
        // Execute the method being tested     
        Customer newCustomer = customerRepo.findByName("eoin");
 
        // Validation  
        assertNotNull(newCustomer);
        assertEquals(expectedCustomer,newCustomer);

    }

    
}
