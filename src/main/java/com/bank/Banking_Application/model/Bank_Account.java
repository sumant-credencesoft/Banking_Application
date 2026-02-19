package com.bank.Banking_Application.model;

import java.util.Objects;

public abstract class Bank_Account implements Transaction {

    private String accountNumber;
    private String holderName;
    protected double balance;

    public Bank_Account(String  accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName (){
        return holderName;
    }
    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bank_Account account = (Bank_Account) obj;
        return Objects.equals(accountNumber, account.accountNumber);
    }
    @Override
    public  int hashCode() {
        return Objects.hash(accountNumber);
    }
}