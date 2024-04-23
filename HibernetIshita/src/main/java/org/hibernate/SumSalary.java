package org.hibernate;

import java.util.List;

import org.hibernate.cfg.Configuration;

public class SumSalary {

	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
         cfg.configure();
         System.out.println(cfg);
         SessionFactory ss =
         	    cfg.buildSessionFactory();
         Session s=ss.openSession();
         Transaction t = s.beginTransaction();
         
         Query q = s.createQuery("select sum(salary)from Employee");
         List<Integer> list = q.list();
         System.out.println(list.get(0));
         t.commit();
         s.close();

	}

}
