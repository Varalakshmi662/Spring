package com.xworkz.itcs.components;

public class WashingMachine {

	private String companyName;
	private float capacity;
	private Motor motor;
	private Power pow;

	public WashingMachine() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	public void wash() {
		if (pow.isOn) {
			System.out.println("washing machine is started");
			this.motor.rotate();
		}
	}

	public void setCapacity(float capacity) {
		System.out.println("invoked setCapacity" + capacity);
		this.capacity = capacity;
	}

	public void setCompanyName(String companyName) {
		System.out.println("invoked setCompanyName" +companyName);
		this.companyName = companyName;
	}

	public void setMotor(Motor motor) {
		System.out.println("invoked setMotor" +motor);
		this.motor = motor;
	}

	public void setPow(Power pow) {
		System.out.println("invoked setPow" +pow);
		this.pow = pow;
	}
}
