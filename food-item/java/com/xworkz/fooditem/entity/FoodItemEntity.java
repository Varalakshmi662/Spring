package com.xworkz.fooditem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import com.xworkz.fooditem.constants.FoodType;
import lombok.Data;

@Data
@Entity
@Table(name="food_items")
public class FoodItemEntity {
	
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator = "auto")
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="TYPE")
	private FoodType type;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="DISCOUNT")
	private int discount;
	
	public FoodItemEntity(String name, double price, FoodType type, int quantity, int discount) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.discount = discount;
	}	
}
