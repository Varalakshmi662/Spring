package com.xworkz.intial.components;

public class ArmyComponent {
	private String countryName;
	private int strength;
	private String type;

	public ArmyComponent(String countryName) {
		super();
		System.out.println("created param constr arg: "+countryName);
		this.countryName = countryName;
	}

	public int getStrength() {
		return strength;
	}

	public String getType() {
		return type;
	}
}
