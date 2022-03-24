package com.example.web.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique  = true)
	private String label;
	
	//mapping with userProduct Entity
	@OneToMany(mappedBy="product")
	private Collection<UserProduct> buys;
	
	//a product belong to one category
	@ManyToOne
	private Category category;

	/*Getters/Setters section start*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Collection<UserProduct> getBuys() {
		return buys;
	}

	public void setBuys(Collection<UserProduct> buys) {
		this.buys = buys;
	}
	
	/*Getters/Setters section end*/
	
	
}
