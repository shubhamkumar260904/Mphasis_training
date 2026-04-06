package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="course_details")

public class Course_Details {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int c_id;
	
	private String c_name;
	
	private String c_duration;
	
	private int c_enrolled;
	
	private int c_total;
	
	@OneToOne(targetEntity = Student_details.class)
	private Student_details st;

	public Student_details getSt() {
		return st;
	}

	public void setSt(Student_details st) {
		this.st = st;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_duration() {
		return c_duration;
	}

	public void setC_duration(String c_duration) {
		this.c_duration = c_duration;
	}

	public int getC_enrolled() {
		return c_enrolled;
	}

	public void setC_enrolled(int c_enrolled) {
		this.c_enrolled = c_enrolled;
	}

	public int getC_total() {
		return c_total;
	}

	public void setC_total(int c_total) {
		this.c_total = c_total;
	}
	
	
}
