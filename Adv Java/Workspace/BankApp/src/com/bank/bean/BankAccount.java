package com.bank.bean;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    long accountNumber;
    String customerName;
    double balance;
    public List<Transaction> transactions = new ArrayList<>();

    public BankAccount(long accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("DEPOSIT", amount));
    }

    public boolean withdraw(double amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount));
        return true;
    }

    @Override
    public String toString() {
        return "Account: " + accountNumber +
               " | Name: " + customerName +
               " | Balance: ₹" + balance;
    }

}
