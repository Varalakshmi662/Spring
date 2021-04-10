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
		ApplicationContext container=new ClassPathXmlApplicationContext("springconfig.xml","application.xml");
//		HotelVendorEntity entity2=new HotelVendorEntity("Mahesh", "chintamani", 4, HotelVendorType.FOODMARKET);
//		HotelVendorService hotelVendorService = container.getBean(HotelVendorService.class);
//		hotelVendorService.validateAndSave(entity2);
//		
//		CustomerEntity entity1=new CustomerEntity("Chethan", "Bangalore", 5, 997511222);
//		CustomerService service=container.getBean(CustomerService.class);
//		service.validateAndSave(entity1);
		
		FoodItemEntity entity=new FoodItemEntity("Pizza",80, FoodType.ITALIAN, 1, 0);
		FoodItemService service2=container.getBean(FoodItemService.class);
		service2.saveAndValidate(entity);
}
}