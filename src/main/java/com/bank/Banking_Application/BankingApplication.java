package com.bank.Banking_Application;

import com.bank.Banking_Application.model.SavingAccount;
import com.bank.Banking_Application.model.CurrentAccount;
import com.bank.Banking_Application.service.BankService;
public class BankingApplication {
	public static void main(String[] args) {
		BankService bankService = new BankService();
		bankService.createAccount(new SavingAccount("100","Sumanta",5000));
		bankService.createAccount( new CurrentAccount("101","Sushil",10000));

		bankService.deposit("100",2000);
		bankService.withdraw("101",5000);
		bankService.printAllAccounts();
	}

}