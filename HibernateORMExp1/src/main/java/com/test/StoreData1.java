package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData1 {

	public static void main(String[] args) {
		
				Configuration cfg=new Configuration();
				cfg.configure("hibernate.cfg.xml");
				SessionFactory sf=cfg.buildSessionFactory();//second-level cache
				Session session=sf.openSession();//first-level cache
				Transaction t=session.beginTransaction();
				Employee1 emp=new Employee1();//Transient
				emp.setEmp_name("SKY");
				emp.setEmp_company("BCC");
				emp.setEmp_city("MUMBAI");
				session.persist(emp);//PERSISTENCE
			
				Employee1 obj=session.find(Employee1.class,102);
				System.out.println(obj.getId()+" "+obj.getEmp_name()+" "+obj.getEmp_company()+" "+obj.getEmp_city());
				obj.setEmp_name("Sharma");
				obj.setEmp_company("PWC");
				obj.setEmp_city("Bangalore");
				
				//session.persist(obj);
				
				//session.remove(obj);
				
				t.commit();
				System.out.println("Done.");
				session.close();//DETACHED STATE
			}

		}

