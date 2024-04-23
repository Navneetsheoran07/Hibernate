package org.hibernate;

import java.util.Scanner;

import org.hibernate.cfg.Configuration;

public class Delete {
	public static void main(String[] args) {
		Configuration config =new Configuration();
		config.configure();
		
		SessionFactory sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session  = sessionFactory.openSession();
		
		Transaction t =session.beginTransaction();
		Student st = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id which you want to delete");
		int i = sc.nextInt();
		st.setId(i);
		session.delete(st);
		t.commit();
		System.out.println("susseccfully deleted");
	}

}
