package com.tnsif.assignment_packagemodifier.employees;

public class Developer extends Employee{
	private String lang;
	private String Branch;
	private int yearsinposition;
	
	public Developer(String name, int employeeid, int salary,String lang, String branch, int yearsinposition) {
		super(name,employeeid,salary);
		this.lang = lang;
		Branch = branch;
		this.yearsinposition = yearsinposition;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public int getYearsinposition() {
		return yearsinposition;
	}
	public void setYearsinposition(int yearsinposition) {
		this.yearsinposition = yearsinposition;
	}
	@Override
	public String toString() {
		return "Developer [name=" + getName() + ", employeeid=" + getEmployeeid() + ", salary=" + getSalary() + " lang=" + lang + ", Branch=" + Branch + ", yearsinposition=" + yearsinposition + "]";
	}
	
	
}
