package com.xworkz.fooditem.repository;

import com.xworkz.fooditem.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {

	public FoodItemRepositoryImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoking save FoodItemRepositoryImpl: "+entity);
		System.out.println("should save into db using JPA");
	}

}
