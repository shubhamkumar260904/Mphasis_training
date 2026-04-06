package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name="marks_details")
@DiscriminatorValue("marks_details")
public class Student_Marks extends Student{

	private int total_marks;
	
	private int course1_marks;
	
	private int course2_marks;

	public int getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}

	public int getCourse1_marks() {
		return course1_marks;
	}

	public void setCourse1_marks(int course1_marks) {
		this.course1_marks = course1_marks;
	}

	public int getCourse2_marks() {
		return course2_marks;
	}

	public void setCourse2_marks(int course2_marks) {
		this.course2_marks = course2_marks;
	}
}
