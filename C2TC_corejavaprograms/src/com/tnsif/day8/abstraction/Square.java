package com.tnsif.day8.abstraction;

public class Square extends Shape{
	private float side;
	public Square()
	{
		side=4.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}
	
	void calArea() {
		super.area=side*side;		
	}
}