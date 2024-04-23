package org.hibernate;

import java.util.List;

import org.hibernate.cfg.Configuration;

public class GetRecord {

	public static void main(String[] args) {
		Configuration config =new Configuration();
		config.configure();
		
		SessionFactory sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session  = sessionFactory.openSession();
		
		Transaction t =session.beginTransaction();
		String qu= "from Student where id>0";
		Query<Student>q=session.createQuery(qu);
		
		List<Student>list=q.list();
		
		for(Student st:list) {
			int i= st.getId();
			String name = st.getName();
			String course = st.getCourse();
			String email = st.getEmail();
			String address = st.getAddress();
			System.out.println(name+" "+course+" "+email+" "+ address);
		}
		
		
		
		
		
	}
	
	
}
