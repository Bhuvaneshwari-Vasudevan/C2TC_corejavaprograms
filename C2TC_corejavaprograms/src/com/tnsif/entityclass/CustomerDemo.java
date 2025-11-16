package com.tnsif.entityclass;


public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setId(777);
		c1.setName("Mahi");
		c1.setCity("Cuddalore");
				
		System.out.println(c1);		
				
		Customer c2=new Customer();
		
		c2.setId(7781);
		c2.setName("Lashu");
		c2.setCity("Cuddalore");
		System.out.println(c2);
		

	}

}