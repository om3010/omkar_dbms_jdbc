package com.gl.bean;

public class Employee {
	int id ;
	String Name ;
	String Email_Id; 
	String Phone_Number;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String email_Id, String phone_Number) {
		super();
		this.id = id;
		Name = name;
		Email_Id = email_Id;
		Phone_Number = phone_Number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}
	public String getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Email_Id=" + Email_Id + ", Phone_Number=" + Phone_Number
				+ "]";
	}
}
