package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="8D_MOVIE")
//@DiscriminatorValue("8D_MOVIE")
public class Movie_8D extends Movie {

	private String Director;

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}
	
	
}
