package com.xworkz.fooditem.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.fooditem.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {

	private SessionFactory factory;
	
	public FoodItemRepositoryImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
		this.factory=factory;
	}
	
	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoking save FoodItemRepositoryImpl: "+entity);
		System.out.println("should save into db using JPA");
//		Configuration cfg=new Configuration();
//		cfg.configure();
//		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

}
