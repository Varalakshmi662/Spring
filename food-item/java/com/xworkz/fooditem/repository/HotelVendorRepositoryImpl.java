package com.xworkz.fooditem.repository;

import com.xworkz.fooditem.entity.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepository {

	public HotelVendorRepositoryImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoked save HotelVendorReositoryImpl"+entity);
		System.out.println("save enity into db using JPA");
	}

}
