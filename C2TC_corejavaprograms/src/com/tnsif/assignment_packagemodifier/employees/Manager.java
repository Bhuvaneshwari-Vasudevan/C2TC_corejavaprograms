package com.tnsif.assignment_packagemodifier.employees;

public class Manager extends Employee {
	private String company;
	private int experience;
	
	public Manager(String name, int employeeid, int salary,String company,int experience) {
		    super(name,employeeid,salary);
		    this.company = company;
		    this.experience = experience;

	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Manager [name=" + getName() + ", employeeid=" + getEmployeeid() + ", salary=" + getSalary() + " company=" + company + ", experience=" + experience + "]";
	}
	
}
