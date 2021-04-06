package com.xworkz.fooditem.service;

import com.xworkz.fooditem.entity.CustomerEntity;
import com.xworkz.fooditem.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Created"+this.getClass().getSimpleName());
		this.customerRepository=customerRepository;
	} 
	
	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		System.out.println("invoked validateAndSave");
		if(entity!=null) {
			System.out.println("entity is valid");
			customerRepository.save(entity);
		}else
		{
			System.out.println("entity is invalid");
		}
		return false;
	}

}
