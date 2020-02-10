
package com.sapient.casestudy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.UniqueConstraint;

@Entity

public class Product {

	@Id
	@GeneratedValue 
	private int id; 
	@ManyToOne
	private Brand brand; 
	@ManyToOne
	private Category category; 
	@ManyToOne
	private Seller seller; 
	private String color; 
	private String sku; 
	private String size; 
	private Double prize;
	public Product(int id, Brand brand, Category category, Seller seller, String color, String sku, String size,
			Double prize) {
		super();
		this.id = id;
		this.brand = brand;
		this.category = category;
		this.seller = seller;
		this.color = color;
		this.sku = sku;
		this.size = size;
		this.prize = prize;
	}
	public Product() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Double getPrize() {
		return prize;
	}
	public void setPrize(Double prize) {
		this.prize = prize;
	}
	
	
}
