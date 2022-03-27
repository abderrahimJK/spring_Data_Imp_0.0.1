package com.example.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.model.User;
import com.example.web.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public void addUser(String name,String passwd) {
		userRepository.save(new User(name,passwd));
	}
	
	
}
 