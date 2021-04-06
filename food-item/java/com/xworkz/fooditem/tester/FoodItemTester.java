package com.xworkz.fooditem.tester;

import com.xworkz.fooditem.constants.FoodType;
import com.xworkz.fooditem.entity.FoodItemEntity;
import com.xworkz.fooditem.repository.FoodItemRepository;
import com.xworkz.fooditem.repository.FoodItemRepositoryImpl;
import com.xworkz.fooditem.service.FoodItemService;
import com.xworkz.fooditem.service.FoodItemServiceImpl;

public class FoodItemTester {

	public static void main(String[] args) {
		FoodItemEntity entity=new FoodItemEntity("Fried Rice",8, FoodType.SOUTHINDIAN, 1, 25);
		FoodItemRepository repository=new FoodItemRepositoryImpl();
		FoodItemService service=new FoodItemServiceImpl(repository);
		service.saveAndValidate(entity);
	}

}
