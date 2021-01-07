package com.springboot.restful.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private Integer product_id;
	private String product_name;
	private float product_price;
	
	
	
	public Product() {
		
	}



	public Product(Integer product_id, String product_name, float product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
	}



	public Integer getProduct_id() {
		return product_id;
	}



	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}



	public String getProduct_name() {
		return product_name;
	}



	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}



	public float getProduct_price() {
		return product_price;
	}



	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	
	
	
	/*
	 * public Product() {
	 * 
	 * }
	 * 
	 * 
	 * public Product(Integer product_id, String product_name, float product_price)
	 * { super(); this.product_id = product_id; this.product_name = product_name;
	 * this.product_price = product_price; }
	 * 
	 * 
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) public Integer getId() {
	 * return product_id; }
	 * 
	 * 
	 * public Integer getProduct_id() { return product_id; } public void
	 * setProduct_id(Integer product_id) { this.product_id = product_id; } public
	 * String getProduct_name() { return product_name; } public void
	 * setProduct_name(String product_name) { this.product_name = product_name; }
	 * public float getProduct_price() { return product_price; } public void
	 * setProduct_price(float product_price) { this.product_price = product_price; }
	 */
	
	
}
