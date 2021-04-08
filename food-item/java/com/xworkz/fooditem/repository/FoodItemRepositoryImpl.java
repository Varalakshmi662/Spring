package com.xworkz.fooditem.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooditem.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {

	public FoodItemRepositoryImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoking save FoodItemRepositoryImpl: "+entity);
		System.out.println("should save into db using JPA");
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

}
