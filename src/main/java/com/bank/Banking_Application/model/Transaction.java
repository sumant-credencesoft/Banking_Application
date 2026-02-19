package com.bank.Banking_Application.model;

public interface Transaction {
    //Interface defines what must be done
    //Class defines how it is done

    void deposit(double amount);
    void withdraw(double amount);
}