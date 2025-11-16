package com.tnsif.constructorexample;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setSid(777);
		s1.setName("Lashu");
		System.out.println(s1);
		
		Student s2=new Student();//Default constructor
		System.out.println(s2);
		
		Student s3=new Student(258,"Abi");//Parameterized constructor
		System.out.println(s3);

	}

}
