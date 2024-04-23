package org.hibernate;

import java.util.List;

import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

public class AscendingOrder {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure();
        System.out.println(cfg);
        SessionFactory sf =
        	    cfg.buildSessionFactory();
        Session s=sf.openSession();
        
        Criteria ct = s.createCriteria(Employee.class);
        ct.addOrder(Order.asc("name"));
        List< Employee>list = ct.list();
        for(Employee e :list) {
        	int i = e.getId();
       	 String n= e.getName();
       	 String p = e.getPost();
       	 int sal = e.getSalary();
       	 int ag= e.getAge();
       	 String ad = e.getAddress();
       	 System.out.println(i+" "+n+" "+p+" "+sal+" "+ag+" "+ad);
        }

	}

}
