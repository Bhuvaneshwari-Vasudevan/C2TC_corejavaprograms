package com.tnsif.day5.inheritance.example;

public class Executor {

	public static void main(String[] args) {
		Student s1=new Student();
		
		s1.setCollegeName("IFET");
		s1.setLocation("Villupuram");
		s1.setSid(7);
		s1.setSname("Abi");
		s1.setCourse("Java");
		
		System.out.println(s1);
		
		Student s2=new Student();
		System.out.println(s2);
		
		Student s3=new Student("IFET","Villupuram",13,"Bhuvana","ECE");
		System.out.println(s3);
	}
	

}
