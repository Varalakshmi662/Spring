package com.xworkz.intial.components;

public class RocketComponent {
	private String fuelType;
	private String Country;
	public RocketComponent(String fuelType, String country) {
		super();
		System.out.println("created param constru, args1: "+fuelType+"args2"+country);
		this.fuelType = fuelType;
		Country = country;
	}
	
	
}
