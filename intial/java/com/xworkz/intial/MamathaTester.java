package com.xworkz.intial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.intial.components.ITCProduct;

public class MamathaTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("initial.xml");
		ITCProduct itcProduct = container.getBean(ITCProduct.class);
		itcProduct.displayDetails();
	}

}
