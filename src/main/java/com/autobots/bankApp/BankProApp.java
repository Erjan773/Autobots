package com.autobots.bankApp;

import com.autobots.bankApp.Client;
import com.autobots.bankApp.CreditAccount;
import com.autobots.bankApp.Currency;


import java.util.HashMap;
import java.util.Map;

public class BankProApp {

    private static final Map<String, Client> clients = new HashMap<>();

    public static <DepositAccount> void main(String[] args) {

        Client asan = new Client("Asan Uson", "123");

        DepositeAccount asanDepositAccount = new DepositeAccount(asan, Currency.USD);
        CreditAccount asanCreditAccount = new CreditAccount(asan, Currency.EUR);

        asan.addAccount(asanDepositAccount);
        asan.addAccount(asanCreditAccount);

        clients.put(asan.getClientID(), asan);



    }
}
