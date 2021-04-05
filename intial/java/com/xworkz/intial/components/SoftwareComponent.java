package com.xworkz.intial.components;

public class SoftwareComponent {
	private String name;
	private String vendor;
	private int version;
	private String type;

	public SoftwareComponent(String name, String vendor) {
		super();
		System.out.println("created param constr arg1: "+name+" arg2: "+vendor);
		this.name = name;
		this.vendor = vendor;
	}

	public String getType() {
		return type;
	}

	public int getVersion() {
		return version;
	}

}
