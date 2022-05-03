package com.example.passenger.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passengers")
public class Passengers {
	
	@Id
	int id;
	String fname;
	String lname;
	String address;
	String mobile;
	String email;
	Passengers(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Passengers(int id, String fname, String lname, 
			String address, String mobile, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Passengers [id=" + id + ",fname="+ fname + ","
				+ " lname=" + lname + ",address="
				 + address + ", mobile=" +mobile + ", email=" + email + "]";
	}
	

}
