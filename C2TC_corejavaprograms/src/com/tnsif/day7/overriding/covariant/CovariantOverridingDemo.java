package com.tnsif.day7.overriding.covariant;

public class CovariantOverridingDemo {
	public static void main(String arg[])
			throws CloneNotSupportedException
		{

			Student student1 = new Student(13, "ECE", "Mahi");
			student1.printData();

			Student student2 = (Student) student1.clone();
			student2.printData();
		}
}
