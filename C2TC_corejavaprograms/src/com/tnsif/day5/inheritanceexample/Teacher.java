package com.tnsif.day5.inheritanceexample;

public class Teacher extends Person {
	private int id;
	private String designation;
	private String session;
	public Teacher(String name,int age,String city,int id,String designation,String session) {
		super(name,age,city);
		this.id=id;
		this.designation=designation;
		this.session=session;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + super.getName() + ", age=" + super.getAge() + ", city=" + super.getCity() + ", id=" + id + ", designation=" + designation + ", session=" + session + "]";
	}
	
}
