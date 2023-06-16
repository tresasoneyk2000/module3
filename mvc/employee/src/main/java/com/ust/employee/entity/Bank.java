package com.ust.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	@GeneratedValue
	private long custid;
	private String name;
	private long amount;
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	public long getCustid() {
		return custid;
	}
	public void setCustid(long custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bank(long custid, String name, long amount) {
		super();
		this.custid = custid;
		this.name = name;
		this.amount = amount;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	

}
