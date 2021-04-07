package com.xworkz.fooditem.service;

import com.xworkz.fooditem.entity.FoodItemEntity;

public interface FoodItemService {
 
	boolean saveAndValidate(FoodItemEntity entity);
}
