package com.metatarsal.models;

public class GroceryList {
	
	private String name;
	private String category;	//make this an enum
	
	public GroceryList() {
		
	}
	
	public GroceryList(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
