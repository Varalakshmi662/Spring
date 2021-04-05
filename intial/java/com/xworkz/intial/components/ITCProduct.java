package com.xworkz.intial.components;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class ITCProduct {
	private String name;
	private String type;
	private String expiryDate;
	
//	PropertyPlaceholderConfigurer
	public ITCProduct(String name) {
		super();
		System.out.println("created param constr"+this.getClass().getSimpleName());
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public void displayDetails() {
		System.out.println("invoking displayDetails");
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.expiryDate);
	}
}
