package com.xworkz.itcs.components;

public class WardenComponent {

	private String name;

	public WardenComponent() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	public void arrangeFood() {
		System.out.println("invoked arrangeFood");
	}
	public void setName(String name) {
		System.out.println("invoked setName"+name);
		this.name = name;
	}
}
