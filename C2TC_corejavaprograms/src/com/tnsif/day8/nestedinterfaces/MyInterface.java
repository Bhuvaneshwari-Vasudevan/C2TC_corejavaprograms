package com.tnsif.day8.nestedinterfaces;

public interface MyInterface {
	void calculateArea();
    interface MyInnerInterface {
       int  id = 13;
       void print();     
    }
}
