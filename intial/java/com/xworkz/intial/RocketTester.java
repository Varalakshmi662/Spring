package com.xworkz.intial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.intial.components.ArmyComponent;
import com.xworkz.intial.components.RocketComponent;
import com.xworkz.intial.components.SoftwareComponent;

public class RocketTester {
public static void main(String[] args) {
	String xmlFileName="assignment.xml";
	ApplicationContext container = new ClassPathXmlApplicationContext(xmlFileName);
	RocketComponent component = container.getBean(RocketComponent.class);
	
	ArmyComponent armyComponent = container.getBean(ArmyComponent.class);
	
	SoftwareComponent softwareComponent = container.getBean(SoftwareComponent.class);
}
}
