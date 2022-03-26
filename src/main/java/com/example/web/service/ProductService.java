package com.example.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.model.Product;
import com.example.web.repository.ProductRepository;


@Service
public class ProductService {

	
	@Autowired
	ProductRepository productRepository;
	
	public void addUser(String name,double price) {
		productRepository.save(new Product(name,price));
	}
}
