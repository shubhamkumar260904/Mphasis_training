package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo_exp {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Student st1=new Student();
		
		st1.setId(1);
		st1.setName("Alex");
		st1.setAge(21);
	
		
		Student_Branch sb1=new Student_Branch();
		
		sb1.setId(2);
		sb1.setName("MARK");
		sb1.setBranch("CSE");
		sb1.setCourse1("Operating System");
		sb1.setCourse2("Computer Architecture");
		
		
		Student_Marks sm1=new Student_Marks();
		
		sm1.setId(3);
		sm1.setName("Roy");
		sm1.setTotal_marks(150);
		sm1.setCourse1_marks(70);
		sm1.setCourse2_marks(80);
		
		
		session.persist(st1);
		session.persist(sb1);
		session.persist(sm1);
		
		t.commit();
		
		System.out.println("Done.");
		
		session.close();

	}

}
