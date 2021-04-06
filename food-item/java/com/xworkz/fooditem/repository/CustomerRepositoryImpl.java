package com.xworkz.fooditem.repository;

import com.xworkz.fooditem.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {

	public CustomerRepositoryImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoking save CustomerRepositoryImpl" + entity);
		System.out.println("update into db using JPA");
	}
}
