package com.tnsif.exceptionexample;

public class ExceptionDemo {

	public static void main(String[] args) {
		int x[]= {23,77,43};
		int c;
		try 
		{
			c=x[4]; //Exception object throwing
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			c=x[2];
			System.out.println("C="+c);
		}
		System.out.println("Next line");
	}

}
	
	
