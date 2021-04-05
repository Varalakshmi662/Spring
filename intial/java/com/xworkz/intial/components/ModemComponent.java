package com.xworkz.intial.components;

public class ModemComponent {
	private String CompanyName;
	private float price;

	public ModemComponent(String companyName) {
		super();
		System.out.println("created param constr, arg: "+companyName);
		CompanyName = companyName;
	}

	public String getCompanyName() {
		return CompanyName;
	}
}
