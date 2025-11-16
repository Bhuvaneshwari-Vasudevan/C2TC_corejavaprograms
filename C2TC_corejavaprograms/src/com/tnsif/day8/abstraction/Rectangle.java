package com.tnsif.day8.abstraction;

public class Rectangle extends Shape{
	private float width, height;

	public Rectangle() {
		this.width = 3.4f;
		this.height = 7.0f;
	}

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	void calArea() {
		area=width*height;		
	}
	

}