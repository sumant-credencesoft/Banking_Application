package com.bank.Banking_Application.repository;


import com.bank.Banking_Application.model.Bank_Account;

import java.util.HashMap;
import java.util.Map;

public class AccountRepository {
    private Map<String, Bank_Account> accountMap = new HashMap<>();

    public  void save(Bank_Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }
    public Bank_Account findByAccountNumber(String accountNumber) {
        return accountMap.get(accountNumber);
    }
    public Map<String,Bank_Account> findAll() {
        return accountMap;
    }
    public boolean exsts(String acccountNumber) {
        return accountMap.containsKey(acccountNumber);
    }
}