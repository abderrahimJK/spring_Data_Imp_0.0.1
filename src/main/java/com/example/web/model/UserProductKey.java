package com.example.web.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserProductKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//To create a PRIMARY KEY constraint on the "user_id" and "product_id" columns 
	@Column(name="user_id")
	int userId;
	@Column(name="product_id")
	int productId;
	
	

}
