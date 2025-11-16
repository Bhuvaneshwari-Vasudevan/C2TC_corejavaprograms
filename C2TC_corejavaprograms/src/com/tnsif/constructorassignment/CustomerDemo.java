package com.tnsif.constructorassignment;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setId(777);
		c1.setName("Abi");
		c1.setCity("Cuddalore");
		System.out.println(c1);
		
		Customer c2=new Customer();//Default constructor
		System.out.println(c2);
		
		Customer c3=new Customer(107,"Anju","Villupuram");//Parameterized constructor
		System.out.println(c3);
	}

}
