package com.example.web.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique  = true)
	private String name;
	private String email;
	
	//mapping with userProduct Entity
	@OneToMany(mappedBy = "user")
	private Collection<UserProduct> buys;

	

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	/*Getters/Setters section start*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<UserProduct> getBuys() {
		return buys;
	}

	public void setBuys(Collection<UserProduct> buys) {
		this.buys = buys;
	}
	
	/*Getters/Setters section end*/
	
}
