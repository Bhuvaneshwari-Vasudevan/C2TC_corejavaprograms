package com.tnsif.day8.implementinginterfaces;

public interface Bank {
	 double MIN_BALANCE = 1500;
	 double DEPOSIT_LIMIT = 25000;
	 double INTEREST_RATE = 8.7;

	 void deposit(Account account, double amount);
	 void withdraw(Account account, double amount);
}
