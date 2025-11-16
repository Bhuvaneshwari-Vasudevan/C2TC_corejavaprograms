package com.tnsif.day5.inheritance.example;

public class Student extends College {
	private int sid;
	private String sname;
	private String course;
	public Student(){
		this.sid=6;
		this.sname="Anju";
		this.course="ECE";		
	}
	public Student(String CollegeName,String Location,int sid,String sname,String course){
		super(CollegeName,Location);
		this.sid=sid;
		this.sname=sname;
		this.course=course;		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + ", CollegeName=" + super.getCollegeName() + ", Location=" + super.getLocation() + "]";
	}
	
}
