package com.xworkz.fooditem.tester;

import com.xworkz.fooditem.entity.CustomerEntity;
import com.xworkz.fooditem.repository.CustomerRepository;
import com.xworkz.fooditem.repository.CustomerRepositoryImpl;
import com.xworkz.fooditem.service.CustomerService;
import com.xworkz.fooditem.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {
		CustomerEntity entity=new CustomerEntity("Chethan", "Bangalore", 5, 997511222);
		CustomerRepository customerRepository=new CustomerRepositoryImpl();
		CustomerService service=new CustomerServiceImpl(customerRepository);
		service.validateAndSave(entity);
	}

}
