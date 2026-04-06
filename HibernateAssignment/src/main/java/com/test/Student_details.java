package com.test;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details")
public class Student_details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int s_rollno;
	
	private String s_name;
	
	private String s_branch;
	
	private int s_age;
	
	@OneToOne(targetEntity = Course_Details.class, cascade = CascadeType.ALL)
	private Course_Details cd;

	public Course_Details getCd() {
		return cd;
	}

	public void setCd(Course_Details cd) {
		this.cd = cd;
	}

	public int getS_rollno() {
		return s_rollno;
	}

	public void setS_rollno(int s_rollno) {
		this.s_rollno = s_rollno;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_branch() {
		return s_branch;
	}

	public void setS_branch(String s_branch) {
		this.s_branch = s_branch;
	}

	public int getS_age() {
		return s_age;
	}

	public void setS_age(int s_age) {
		this.s_age = s_age;
	}
	
}
