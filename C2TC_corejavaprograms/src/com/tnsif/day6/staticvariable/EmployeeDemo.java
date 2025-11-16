package com.tnsif.day6.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {

		System.out.println(Employee.companyName);
		
		Employee e = new Employee("Bhuvana", 137);
		System.out.println(e);
		
		e = new Employee("Lashu", 258);
		System.out.println(e);
	}
}