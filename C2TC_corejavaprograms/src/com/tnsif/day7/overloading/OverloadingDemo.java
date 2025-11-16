package com.tnsif.day7.overloading;

public class OverloadingDemo {
	public static void main(String[] args) {

		System.out.println("<-- Constructor Overloading -->");
		
		Point p = new Point(); //default constructor invoked
		System.out.println(p);

		Point p1 = new Point(17.7f); //single parameter constructor
		System.out.println(p1);

		Point p2 = new Point(71.2f, 14.20f); //two parameters constructor
		System.out.println(p2);

		System.out.println("<-- Method Overloading -->");
		System.out.println("Addition of two integers : " + MethodOverloading.addition(70, 20));
		System.out.println("Addition of two floating numbers :" + MethodOverloading.addition(30.3f, 20.2f));
		System.out.println("Addition of one integer and one float :" + MethodOverloading.addition(13, 23.0f));
		System.out.println("Addition of one float and one integer :" + MethodOverloading.addition(22.3f, 43));
		System.out.println("Addition of two Strings : " + MethodOverloading.addition("Welcome ", "Everyone"));
	}
}


