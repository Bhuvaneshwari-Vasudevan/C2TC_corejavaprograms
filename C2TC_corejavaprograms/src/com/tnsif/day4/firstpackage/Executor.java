package com.tnsif.day4.firstpackage;

public class Executor {
	public static void main(String[] args) {
		
			Base b1=new Base();
			b1.methodDefault();
			b1.methodProtected();
			b1.methodPublic();
			
			b1.varDefault=13;
			b1.methodDefault();
			b1.varProtected=42;
			b1.methodProtected();
			b1.varPublic=21;
			b1.methodPublic();
			
			System.out.println(b1 instanceof Base);
	}
}
