package com.tnsif.day6.usingfinal;

public class FinalVariable {
	final int x = 100;

	final static int Y;

	// Declare & initialize static final variable.
	final static int Z = 77;

	// instance method
	void change() {
		x = 18; // final variables can't be reassigned
		Y = 370; // final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	static {
		Y = 25;
		Z = 170; // Can't be reassigned
		System.out.println("Value of Y: " + Y);
	}

}

