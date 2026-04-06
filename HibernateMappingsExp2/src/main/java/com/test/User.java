package com.test;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id", insertable=false, nullable=true)
	private int id;
	
	private String u_name;
	
	@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name="o_id")
	//@OrderColumn(name="type")
	private List<Order> order1;
	
	public List<Order> getOrder1() {
		return order1;
	}
	public void setOrder1(List<Order> order1) {
		this.order1 = order1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	
}
