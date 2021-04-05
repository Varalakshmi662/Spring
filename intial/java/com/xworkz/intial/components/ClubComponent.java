package com.xworkz.intial.components;

public class ClubComponent {
	private String trustName;
	private int totalMembers;
	public ClubComponent(String trustName) {
		super();
		System.out.println("creating param constructor, args: " + trustName);
		this.trustName = trustName;
	}
	public String getTrustName() {
		return trustName;
	}
	public ClubComponent(String trustName, int totalMembers) {
		super();
		System.out.println("craeting using param constru, arg1: "+trustName+ "args2: " +totalMembers);
		this.trustName = trustName;
		this.totalMembers = totalMembers;
	}
	
}
