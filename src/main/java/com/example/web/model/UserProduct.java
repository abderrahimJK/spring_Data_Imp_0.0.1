package com.example.web.model;

import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class UserProduct {

	@EmbeddedId
	UserProductKey id;
	
	private LocalDateTime buyDate;
	private int amount;
	
	//
	@ManyToOne
	@MapsId("userId")
	@JoinColumn(name ="user_id")
	private User user;
	
	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name="product_id")
	private Product product;

	public UserProductKey getId() {
		return id;
	}

	public LocalDateTime getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(LocalDateTime buyDate) {
		this.buyDate = buyDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	
}
