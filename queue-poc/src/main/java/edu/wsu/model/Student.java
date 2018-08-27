package edu.wsu.model;

import java.io.Serializable;

public class Student implements Serializable{
	
	private String fname;
	private String lname;
	private String wsuid;
	private String email;
	private String phone;
	
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
	public String getWsuid() {
		return wsuid;
	}
	public void setWsuid(String wsuid) {
		this.wsuid = wsuid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
