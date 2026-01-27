package com.bank.bean;

public class Transaction {
	String type;
    double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    
    public Transaction() {
    	
    }

    @Override
    public String toString() {
        return type + " : ₹" + amount;
    }

}
