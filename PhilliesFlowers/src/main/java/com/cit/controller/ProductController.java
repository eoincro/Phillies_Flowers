package com.cit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cit.basepackage.entities.Orders;
import com.cit.basepackage.entities.Product;
import com.cit.repositories.CustomerRepo;
import com.cit.repositories.OrderRepo;
import com.cit.repositories.ProductRepo;




@Controller
public class ProductController {

	@Autowired
	ProductRepo productsRepo;
	
	@Autowired
	OrderRepo ordersRepo;


	@GetMapping("/displayAllProducts")
	public String displayAll(Model model)
	{
		List<Product> p = productsRepo.findAll();
		model.addAttribute("Products", p);
		return "displayAllProducts";
	}
	
	@GetMapping("/displayAllCustomerOrders")
	public String displayallcustomerorders(Model model)
	{
		List<Orders> orders = ordersRepo.findAll();
		Orders o = new Orders();
		o = ordersRepo.findByOrderID(1);
		o.getProducts();
		model.addAttribute("products",o.getProducts());
		return "displayallcustomerorders";
	}
	
	@GetMapping("/addProductOrder")
	public String addproductorder(Model model)
	{
		List<Product> p = productsRepo.findAll();
		model.addAttribute("Products", p);
		return "addproductorder";
	}
// attempts at adding a product to a customer	
//	@PostMapping("/addProductOrder")
//	public String customPackage(Product p )
//	{
//		//.addCustomPackageToCart(p);
//			order.addProductOrder(p);
//			ordersRepo.save(order);
//		return "redirect:/displayAllCustomerOrders";	
//	}
	
//    @RequestMapping("/save")
//    public String save(@RequestParam int orderID, @RequestParam int quantity, @RequestParam int price, @RequestParam String productID, String productName) {
//        Product p = new Product();
//	  	  p.setProductID(productID);
//		  p.setOrderID(orderID);
//		  p.setPrice(price);
//		  p.setProductName(productName);
//		  p.setQuantity(quantity);
//		  Orders o = new Orders();
//		  o.setOrderID(1);
//		  o.setPrice(2);
//		  orderRepo.save(o);
//        return "redirect:/show/" + product.getId();
//    }

	
}