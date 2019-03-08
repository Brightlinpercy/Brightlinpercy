package com;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
	public static void main(String[]args)
	{
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory= config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Product product=new Product();
		product.setProductid(1001);
		product.setProductname("samsung");
		product.setPrice(7000);
		session.save(product);
		session.getTransaction().commit();
		session.close();
		System.out.println("object saved in database");
		
	}
	
	

}
