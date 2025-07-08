package com.autobots.bankApp;

public abstract class DepositeAccount extends BankAccaunt{

    public DepositeAccount(Client owner, Currency currency) {
        super(owner, currency);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        addTransaction("DEPOSITE" , amount);
    }

    @Override
    boolean withdraw(double amount) {
        if (amount <= balance){
            balance -= amount;
            addTransaction("WITHDRAW", amount);
            return true;

        }
        return false;
    }
}
