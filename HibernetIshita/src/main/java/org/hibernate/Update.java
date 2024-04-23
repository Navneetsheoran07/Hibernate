package org.hibernate;

import org.hibernate.cfg.Configuration;

public class Update {

	
	public static void main(String[] args) {
		Configuration config =new Configuration();
		config.configure();
		
		SessionFactory sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session  = sessionFactory.openSession();
		
		Transaction t =session.beginTransaction();
		
		Student s =  session.get(Student.class, 2);
		
		String name = s.setName("Sahil");
		String em = s.setEmail("sahil@gmail.com");
		session.update(s);
		session.save(s);
		t.commit();
		System.out.println("updation sussessfully");
	}
}
