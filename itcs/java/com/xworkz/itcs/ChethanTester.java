package com.xworkz.itcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.itcs.components.PGComponent;

public class ChethanTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("dependinject.xml");
		PGComponent pgComponent =container.getBean(PGComponent.class);
		pgComponent.serveFood();
	}

}
