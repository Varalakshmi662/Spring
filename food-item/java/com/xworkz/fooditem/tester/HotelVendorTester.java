package com.xworkz.fooditem.tester;

import com.xworkz.fooditem.constants.HotelVendorType;
import com.xworkz.fooditem.entity.HotelVendorEntity;
import com.xworkz.fooditem.repository.HotelVendorRepository;
import com.xworkz.fooditem.repository.HotelVendorRepositoryImpl;
import com.xworkz.fooditem.service.HotelVendorService;
import com.xworkz.fooditem.service.HotelVendorServiceImpl;

public class HotelVendorTester {

	public static void main(String[] args) {
		HotelVendorEntity entity=new HotelVendorEntity("Mahesh", "Chintamani", 4.5f, HotelVendorType.RETAILER);
		HotelVendorRepository repository=new HotelVendorRepositoryImpl();
		HotelVendorService service=new HotelVendorServiceImpl(repository);
		service.validateAndSave(entity);
	}

}
