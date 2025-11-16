package com.tnsif.entityassignment;


public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		p1.setProductid(777);
		p1.setProductname("ESP32");
		p1.setPrice("$10");
				
		System.out.println(p1);		
				
		Product p2=new Product();
		
		p2.setProductid(7781);
		p2.setProductname("Resistor");
		p2.setPrice("$2");
		System.out.println(p2);
		
		Product p3=new Product();
		p3.setProductid(771);
		p3.setProductname("Capacitor");
		p3.setPrice("$2");
		System.out.println(p3);
		

	}

}
