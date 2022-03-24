package com.example.web.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class UserProduct {

	@EmbeddedId
	UserProductKey id;
	
	//
	@ManyToOne
	@MapsId("userId")
	@JoinColumn(name ="user_id")
	private User user;
	
	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name="product_id")
	private Product product;
	
}
