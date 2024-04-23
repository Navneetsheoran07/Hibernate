package org.hibernate;

import java.util.List;

import org.hibernate.cfg.Configuration;

public class Restrictions {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure();
        System.out.println(cfg);
        SessionFactory sf =
        	    cfg.buildSessionFactory();
        Session s=sf.openSession();
        Criteria ct = s.createCriteria(Employee.class);
        // above 20k
        ct.add(org.hibernate.criterion.Restrictions.gt("salary", 20000));
        //below 20k
      //  ct.add(org.hibernate.criterion.Restrictions.lt("salary", 20000));
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
