package com.xworkz.fooditem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.Transaction;

import lombok.Data;

@Data
@Entity
@Table
public class Bussiness {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "NO_OF_EMPLOYEES")
	private int noOfEmployees;
	@Column(name = "INVESTMENT")
	private int investment;
	@Column(name = "BUSSINESS_TYPE")
	private String bussinessType;
	
	public Bussiness() {
		
	}
	public Bussiness(String name, int noOfEmployees, int investment, String bussinessType) {
		super();
		this.name = name;
		this.noOfEmployees = noOfEmployees;
		this.investment = investment;
		this.bussinessType = bussinessType;
	}
	
}
