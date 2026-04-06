package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo_Samp {

	public static void main(String[] args) {
		
Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction t=session.beginTransaction();
		
		Course_Details c1=new Course_Details();
		
		c1.setC_id(1);
		c1.setC_name("OS");
		c1.setC_duration("4 weeks");
		c1.setC_enrolled(50);
		c1.setC_total(100);
		
		Student_details s1=new Student_details();
		
		s1.setS_rollno(120);
		s1.setS_name("Ryan");
		s1.setS_branch("ISE");
		s1.setS_age(21);
		
		
		s1.setCd(c1);
		c1.setSt(s1);
		
		session.persist(s1);

		t.commit();
		
		System.out.println("Done.");

		session.close();

	}

}
