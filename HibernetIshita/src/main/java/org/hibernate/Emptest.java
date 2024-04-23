package org.hibernate;

import org.hibernate.cfg.Configuration;

public class Emptest {
	
	public static void main(String[] args) {
		
		 Configuration cfg=new Configuration();
         cfg.configure();
        
         SessionFactory ss =
         	    cfg.buildSessionFactory();
         Session s=ss.openSession();
         Transaction t = s.beginTransaction();
         
         Employee e = new Employee();
         
         e.setName("Navneet");
         e.setPost(" Android developer");
         e.setSalary(35000);
         e.setAge(24);
         e.setAddress("Mohali");
         s.save(e);
         t.commit();
         System.out.println("Data save");
         s.close();
         
	}

}
