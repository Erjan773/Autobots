package com.autobots.bankApp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class BankAccaunt {
    protected String accountNumber;
    protected double balance;
    protected final Client owner;
    protected final Currency currency;
    protected final List<Transction> transctions = new ArrayList<>();

    public BankAccaunt(Client owner, Currency currency) {
        this.owner = owner;
        this.currency = currency;
        this.accountNumber = UUID.randomUUID().toString();
    }

    abstract void deposit(double amount);

    abstract boolean withdraw(double amount);

    void addTransaction(String type, double amount){
        transctions.add(new Transction(type, amount));

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Client getOwner() {
        return owner;
    }

    public Currency getCurrency() {
        return currency;
    }

    public List<Transction> getTransctions() {
        return transctions;
    }
}
