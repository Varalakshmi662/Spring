package com.xworkz.fooditem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.fooditem.constants.FoodType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="food-item")
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="PRICE")
	private double price;
	@Column(name="FOOD_TYPE")
	private FoodType type;
	@Column(name="QUANTITY")
	private int quantity;
	@Column(name="DISCOUNT")
	private int discount;
		
}
