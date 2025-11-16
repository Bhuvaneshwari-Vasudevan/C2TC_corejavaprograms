package com.tnsif.day7.overloading.v1;

public class Operations {
	//For checking numbers
	public static boolean isPalindrome(int n)
	{
		int rev=0;
		int dummyNumber =n;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		return dummyNumber==rev;
	}

	//For checking string
	public static boolean isPalindrome(String str)
	{
		String rev;
		rev=new StringBuffer(str).reverse().toString();
		return str.equals(rev);
	}
}
