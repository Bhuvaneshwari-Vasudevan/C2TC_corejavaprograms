package com.tnsif.abstractassignment;

public class Executor {

	public static void main(String[] args) {
		Shopping f1=new FoodCourt();
		f1.mall();
		f1.order();
		
		Shopping e1=new Electronics();
		e1.mall();
		e1.order();
		
	}

}
