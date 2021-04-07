package com.xworkz.fooditem.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooditem.constants.FoodType;
import com.xworkz.fooditem.constants.HotelVendorType;
import com.xworkz.fooditem.entity.CustomerEntity;
import com.xworkz.fooditem.entity.FoodItemEntity;
import com.xworkz.fooditem.entity.HotelVendorEntity;
import com.xworkz.fooditem.service.CustomerService;
import com.xworkz.fooditem.service.FoodItemService;
import com.xworkz.fooditem.service.HotelVendorService;

public class MainTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("springconfig.xml");
		FoodItemService foodItemService = container.getBean(FoodItemService.class);
		FoodItemEntity entity=new FoodItemEntity("Masala Dosa", 50, FoodType.SOUTHINDIAN, 01, 25);
		foodItemService.saveAndValidate(entity);
		
		System.out.println("**************************************");
		
		CustomerEntity entity1=new CustomerEntity("Chethan", "bangalore", 5, 875214521);
		CustomerService customerService = container.getBean(CustomerService.class);
		customerService.validateAndSave(entity1);
		
		System.out.println("***************************************");
		
		HotelVendorEntity entity2=new HotelVendorEntity("Mahesh", "chintamani", 4, HotelVendorType.FOODMARKET);
		HotelVendorService hotelVendorService = container.getBean(HotelVendorService.class);
		hotelVendorService.validateAndSave(entity2);
	}

}
