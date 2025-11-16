package com.tnsif.day5.inheritanceexample;

public class Executor {

	public static void main(String[] args) {
		Student s=new Student("Abi",20,"Cuddalore",7,"ECE");
		System.out.println(s);
		
		Teacher t=new Teacher("Anu",25,"Villupuram",732,"Assistant Professor","Technical");
		System.out.println(t);

	}

}
