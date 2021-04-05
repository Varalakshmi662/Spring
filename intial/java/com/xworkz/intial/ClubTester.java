package com.xworkz.intial;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.intial.components.ClubComponent;
import com.xworkz.intial.components.ModemComponent;
public class ClubTester {

	public static void main(String[] args) {
		String xmlFileName="initial.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(xmlFileName);
//		System.out.println(container.getBeanDefinitionCount());
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		String refOfString=container.getBean(String.class);
		ClubComponent component=container.getBean("clubComponent1",ClubComponent.class);
//		System.out.println(component);
		System.out.println(refOfString);
		
		ModemComponent modemComponent = container.getBean(ModemComponent.class);
		System.out.println(modemComponent.getCompanyName());
	}

}
