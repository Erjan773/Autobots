package com.autobots.bankApp;

public class CreditAccount extends BankAccaunt {

    private  final  double creditlimit = 1000;
    public CreditAccount(Client owner, Currency currency) {
        super(owner, currency);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        addTransaction("DEPOSITE", amount);

    }

    @Override
    boolean withdraw(double amount) {
        if (amount <= balance + creditlimit){
            balance -= amount;
            addTransaction("WITHDRAW", amount);
            return true;
        }
        return false;
    }
}
