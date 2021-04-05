package com.xworkz.itcs.components;

public class Motor {
	private int warrantyPeriod;

	public void rotate() {
		System.out.println("motor rotating");
	}
	
	public void setWarrantyPeriod(int warrantyPeriod) {
		System.out.println("invoked setWarranty: "+warrantyPeriod);
		this.warrantyPeriod = warrantyPeriod;
	}
}
