package com.example.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.web.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService; 
	
	@GetMapping("/user")
	public String user(@RequestParam String name, @RequestParam String password) {
		userService.addUser(name, password);
		return "user";
	}
	
	@GetMapping("/products")
	public String user() {
		return "index";
	}
	
}
