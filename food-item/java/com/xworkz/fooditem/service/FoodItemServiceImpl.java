package com.xworkz.fooditem.service;

import com.xworkz.fooditem.entity.FoodItemEntity;
import com.xworkz.fooditem.repository.FoodItemRepository;

public class FoodItemServiceImpl implements FoodItemService {
	// to achieve loose coupling 
	private FoodItemRepository fooditemRepository;
	
	public FoodItemServiceImpl(FoodItemRepository fooditemRepository) {
		System.out.println("Created" + this.getClass().getSimpleName());
		this.fooditemRepository=fooditemRepository;
	}

	@Override
	public boolean saveAndValidate(FoodItemEntity entity) {
		System.out.println("invoked saveAndValidate");
		if (entity != null) {
			System.out.println("entity is valid");
			// it will tightly coupled to overcome this we have intialized this as a instance variable
//			FoodItemRepository repository=new FoodItemRepositoryImpl();
			this.fooditemRepository.save(entity);
		} else {
			System.out.println("entity is invalid");
		}
		return false;
	}

}
