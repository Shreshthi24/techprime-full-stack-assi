package com.techprime.dao;

public class UserDao {

	  private int employeeid;
	private String email;
	private String password;
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDao(int employeeid, String email, String password) {
		super();
		this.employeeid = employeeid;
		this.email = email;
		this.password = password;
	}
	
}
