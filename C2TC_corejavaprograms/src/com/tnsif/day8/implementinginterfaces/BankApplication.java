package com.tnsif.day8.implementinginterfaces;

public class BankApplication {

	public static void main(String[] args) {
		Bank bank = new BankImpl();

	     Account account = new Account(137, "Bhuvana", 77000, bank);

	     account.deposit(7000);
	
	     System.out.println(account);
	  
	     account.withdraw(13000);
	   
	     System.out.println(account);
	}

}
