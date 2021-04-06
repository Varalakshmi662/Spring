package com.xworkz.fooditem.service;

import com.xworkz.fooditem.entity.HotelVendorEntity;
import com.xworkz.fooditem.repository.HotelVendorRepository;

public class HotelVendorServiceImpl implements HotelVendorService {

	private HotelVendorRepository hotelVendorRepository;
	
	public HotelVendorServiceImpl(HotelVendorRepository hotelVendorRepository) {
		System.out.println("Created"+this.getClass().getSimpleName());
		this.hotelVendorRepository=hotelVendorRepository;
	}
	
	@Override
	public boolean validateAndSave(HotelVendorEntity entity) {
		System.out.println("invoking validateAndSave");
		if(entity!=null) {
			System.out.println("entity is valid");
			hotelVendorRepository.save(entity);
		}else {
			System.out.println("entity is invalid");
		}
		return false;
	}

}
