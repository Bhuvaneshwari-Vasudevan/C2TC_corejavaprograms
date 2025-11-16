package com.tnsif.entityassignment;

public class Student {
	private int Studentid;
	private String Studentname;
	private String Dept;
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public String toString() {
		return "Student [Studentid=" + Studentid + ", Studentname=" + Studentname + ", Dept=" + Dept + "]";
	}
	
}
