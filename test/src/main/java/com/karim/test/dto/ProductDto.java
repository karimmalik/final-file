package com.karim.test.dto;

import java.io.Serializable;

public class ProductDto implements Serializable {
 	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String price;
	
	public ProductDto() {

	}

	public ProductDto(String id, String name, String price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "{ "
				+ "id : " + id + ","
				+ "name : " + name + "," 
				+ "price : " + price
				+ "}";
	}	
	
}
