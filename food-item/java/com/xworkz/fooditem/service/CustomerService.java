package com.xworkz.fooditem.service;

import com.xworkz.fooditem.entity.CustomerEntity;

public interface CustomerService {

	boolean validateAndSave(CustomerEntity entity);
}
