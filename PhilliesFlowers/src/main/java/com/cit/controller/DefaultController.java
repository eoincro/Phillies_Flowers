package com.cit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cit.repositories.CustomerRepo;

@Controller
public class DefaultController {
	@Autowired
	CustomerRepo customerRepo;
	
	@GetMapping("/")
	public String home1() {
		return "/home";
	}

	@GetMapping("/home")
	public String home() {
		return "/home";
	}

	@GetMapping("/admin")
	public String admin() {
		return "/admin";
	}

	@GetMapping("/customer")
	public String user() {
		return "/customer";
	}


	@GetMapping("/login")
	public String login() {
		return "/login";
	}

	@GetMapping("/403")
	public String error403() {
		return "/error/403";
	}
	
	

}
