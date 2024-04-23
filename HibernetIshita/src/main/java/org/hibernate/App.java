package org.hibernate;

import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	try {
    		
    		Configuration config =new Configuration();
    		config.configure();
    		System.out.println(config);
    		SessionFactory sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();
    		
    		Session session  = sessionFactory.openSession();
    		System.out.println(session);
    		Student s = new Student();
    		s.setName("Ishita");
    		s.setCourse("java");
    		s.setEmail("ishita@gmail.com");
    		s.setAddress("Himachal");
    		
    		session.save(s);
    		Transaction t =session.beginTransaction();
    		t.commit();
    		
    		
    		
    		
    		
    		
    		
    	}catch (Exception e) {
			System.out.println(e);
		}
    }
}
