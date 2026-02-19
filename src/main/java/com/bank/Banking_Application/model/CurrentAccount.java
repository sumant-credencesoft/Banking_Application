package com.bank.Banking_Application.model;

public class CurrentAccount extends Bank_Account{

    private static final double OVERDRAFT_LIMIT = 100000.0;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    @Override
    public void withdraw(double amount) {
        if ( balance + OVERDRAFT_LIMIT >= amount) {
            balance -= amount;
            System.out.println("Withdrawal amount =: " + amount);
        } else {
            System.out.println("Withdrawal denied. Overdraft limit of " + OVERDRAFT_LIMIT + " exceeded.");
        }
    }
}