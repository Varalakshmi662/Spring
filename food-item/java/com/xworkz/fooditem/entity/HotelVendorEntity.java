package com.xworkz.fooditem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.fooditem.constants.HotelVendorType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "hotel_info")
public class HotelVendorEntity {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "RATING")
	private float rating;
	@Column(name = "HOTEL_VENDOR_TYPE")
	private HotelVendorType type;

	public HotelVendorEntity(String name, String location, float rating, HotelVendorType type) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.type = type;
	}

}
