package org.hibernate;

import java.util.List;

import org.hibernate.cfg.Configuration;

public class EmpSalaryAvrage {

	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
         cfg.configure();
         System.out.println(cfg);
         SessionFactory sf =
         	    cfg.buildSessionFactory();
         Session s=sf.openSession();
         Transaction t = s.beginTransaction();
         
         
         Query q1 = s.createQuery(" select avg (salary)from Employee");
         List<Integer > list = q1.list();
         
         System.out.println("Average of Salary "+list);
         
         Query q2 = s.createQuery(" select count(eid) from Employee");
         List<Integer > list2 = q2.list();
         
         System.out.println("Number of Employees "+list2);
         
         
         Query q3 = s.createQuery(" select min(salary) from Employee");
         List<Integer > list3 = q3.list();
         
         System.out.println("Minimum Salary "+list3);
         
         Query q4 = s.createQuery(" select max(salary) from Employee");
         List<Integer > list4 = q4.list();
         
         System.out.println("Maximum Salary "+list4);
	}

}
