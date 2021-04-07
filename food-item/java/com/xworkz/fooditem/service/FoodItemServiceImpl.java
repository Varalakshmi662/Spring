package com.xworkz.fooditem.service;

import com.xworkz.fooditem.entity.FoodItemEntity;
import com.xworkz.fooditem.repository.FoodItemRepository;
import com.xworkz.fooditem.repository.FoodItemRepositoryImpl;

public class FoodItemServiceImpl implements FoodItemService {
	// to achieve loose coupling 
	private FoodItemRepository itemRepository;
	
	public FoodItemServiceImpl(FoodItemRepository repository) {
		System.out.println("Created" + this.getClass().getSimpleName());
		this.itemRepository=itemRepository;
	}

	@Override
	public boolean saveAndValidate(FoodItemEntity entity) {
		System.out.println("invoked saveAndValidate" + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			// it will tightly coupled to overcome this we have intialized this as a instance variable
//			FoodItemRepository repository=new FoodItemRepositoryImpl();
			itemRepository.save(entity);
		} else {
			System.out.println("entity is invalid");
		}
		return false;
	}

}
