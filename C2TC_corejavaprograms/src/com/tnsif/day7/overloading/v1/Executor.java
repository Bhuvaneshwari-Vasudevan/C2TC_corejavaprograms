package com.tnsif.day7.overloading.v1;

public class Executor {
	public static void main(String[] args) {

		System.out.println("Is 737 Palindrome? "+Operations.isPalindrome(737));
		System.out.println("Is 197 Palindrome? "+Operations.isPalindrome(197));
		
		System.out.println("Is JAVA Palindrome? "+Operations.isPalindrome("JAVA"));
		System.out.println("Is RACECAR Palindrome? "+Operations.isPalindrome("RACECAR"));

	}
}
