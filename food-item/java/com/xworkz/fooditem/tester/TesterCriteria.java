//package com.xworkz.fooditem.tester;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import com.xworkz.fooditem.entity.Bussiness;
//
//public class TesterCriteria {
//	private static SessionFactory factory; 
//	public static void main(String[] args) {
//		try {
//	         factory = new Configuration().configure().buildSessionFactory();
//	      } catch (Throwable ex) { 
//	         System.err.println("Failed to create sessionFactory object." + ex);
//	         throw new ExceptionInInitializerError(ex); 
//	      }
//
//		Bussiness bs=new Bussiness();
//	      /* Add few bussiness records in database */
//		Integer buss1=bs.addBussiness("bikeride",2000,100000,"service");
//
//		Integer addBussiness(String nm, int noofemp, int j, String string2) {
//			Session session = factory.openSession();
//		      Transaction tx = null;
//		      Integer employeeID = null;		
//		      return;
//		}
//	}
//
//}
