package com.tnsif.day8.markerinterfaces;

public class MarkerInterfaceDemo {
	public static void main(String[] args) {
		Student s=new Student(13,"Bhuvana",10000,"Java");
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			

	}
}
