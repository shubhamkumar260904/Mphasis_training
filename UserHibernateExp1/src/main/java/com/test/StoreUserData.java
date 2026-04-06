package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreUserData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("userdetails.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();//second-level cache
		Session session=sf.openSession();//first-level cache
		Transaction t=session.beginTransaction();
		UserDetails obj=new UserDetails();//Transient
		obj.setUser_name("Alex");
		obj.setUser_branch("CSE");
		obj.setUser_location("Bangalore");
		obj.setUser_age(21);
		session.persist(obj);//PERSISTENCE
	
		//UserDetails obj2=session.find(UserDetails.class,102);
		//System.out.println(obj.getReg_no()+" "+obj.getUser_name()+" "+obj.getUser_name()+" "+obj.getUser_branch()+" "+obj.getUser_location()+" "+obj.getUser_age());
		
		//session.persist(obj);
		
		//session.remove(obj);
		
		t.commit();
		System.out.println("Done.");
		session.close();//DETACHED STATE

	}

}
