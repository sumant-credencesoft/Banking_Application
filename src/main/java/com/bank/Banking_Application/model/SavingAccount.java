package com.bank.Banking_Application.model;

public class SavingAccount extends Bank_Account {

    private static final double MINIMUM_BALANCE = 1000.0;


    public SavingAccount(String accountNumber, String holderName, double balance) {
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
        if ( balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawal amount =: " + amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of " + MINIMUM_BALANCE + " must be maintained.");
        }
    }
}