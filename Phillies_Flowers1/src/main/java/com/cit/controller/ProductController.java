package com.cit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cit.basepackage.entities.Product;
import com.cit.repositories.CustomerRepo;
import com.cit.repositories.OrderRepo;
import com.cit.repositories.ProductRepo;



@Controller
public class ProductController {

	@Autowired
	ProductRepo productsRepo;

	@GetMapping("/displayAllProducts")
	public String displayAll(Model model)
	{
		List<Product> p = productsRepo.findAll();
		model.addAttribute("Products", p);
		return "displayAllProducts";
	}
}
