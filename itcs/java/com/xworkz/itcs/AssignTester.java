package com.xworkz.itcs;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.itcs.components.Power;
import com.xworkz.itcs.components.WashingMachine;

public class AssignTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("assign.xml");
		WashingMachine washingMachine = container.getBean(WashingMachine.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		washingMachine.wash();
	}

}
