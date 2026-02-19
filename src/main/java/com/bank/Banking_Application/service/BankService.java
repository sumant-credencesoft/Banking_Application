package com.bank.Banking_Application.service;

import com.bank.Banking_Application.exception.AccountNotFoundException;
import com.bank.Banking_Application.exception.InsufficientBalanceException;
import com.bank.Banking_Application.model.Bank_Account;
import com.bank.Banking_Application.repository.AccountRepository;

public class BankService {
    private AccountRepository repository = new AccountRepository();

    public void createAccount(Bank_Account account) {
        repository.save(account);
    }

    public void deposit(String accountNumber, double amount) {
        Bank_Account account = repository.findByAccountNumber(accountNumber);

        if (account == null) {
            throw new AccountNotFoundException(("Account not found: " + accountNumber));
        }
        account.deposit(amount);

    }

    public  void withdraw(String acccountNumber, double amount) {
        Bank_Account account = repository.findByAccountNumber(acccountNumber);

        if (account == null) {
            throw new AccountNotFoundException(("Account not found: " + acccountNumber));
        }
        if (account.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient balance for account: " + acccountNumber);
        }
        account.withdraw(amount);
    }
    public void printAllAccounts() {
        repository.findAll().values().forEach(System.out::println);
    }

}

