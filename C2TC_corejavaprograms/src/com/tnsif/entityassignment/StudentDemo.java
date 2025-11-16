package com.tnsif.entityassignment;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudentid(777);
		s1.setStudentname("Bella");
		s1.setDept("ECE");
				
		System.out.println(s1);		
				
		Student s2=new Student();
		
		s2.setStudentid(7781);
		s2.setStudentname("Lashu");
		s2.setDept("CSE");
		System.out.println(s2);
		
		Student s3=new Student();
		
		s3.setStudentid(781);
		s3.setStudentname("Abi");
		s3.setDept("ECE");
		System.out.println(s3);

	}

}
