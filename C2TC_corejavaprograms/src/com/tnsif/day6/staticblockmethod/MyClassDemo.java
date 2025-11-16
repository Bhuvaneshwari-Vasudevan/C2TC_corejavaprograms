package com.tnsif.day6.staticblockmethod;

public class MyClassDemo {

	public static void main(String[] args) {

		MyClass m1 = new MyClass();
		System.out.println(m1);

		MyClass.display();

		MyClass m2 = new MyClass();
		System.out.println(m2);
		
		MyClass.display();
		MyClass m3 = new MyClass();
		
		System.out.println(m3);
		
		MyClass.display();

	}

}
