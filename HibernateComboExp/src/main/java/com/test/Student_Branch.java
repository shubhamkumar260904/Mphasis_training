package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name="course_details")
@DiscriminatorValue("course_details")
public class Student_Branch extends Student {

	
	private String branch;
	
	private String course1;
	
	private String course2;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCourse1() {
		return course1;
	}

	public void setCourse1(String course1) {
		this.course1 = course1;
	}

	public String getCourse2() {
		return course2;
	}

	public void setCourse2(String course2) {
		this.course2 = course2;
	}
}
