package com.without.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Entity1 {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	public Entity1() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Entity1(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
