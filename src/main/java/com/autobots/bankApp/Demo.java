package com.autobots.bankApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, Client> clients = new HashMap<>();

    public static void main(String[] args) {

        Client asan = new Client("asan uson", "123");
        DepositeAccount asanDepositAccount = new DepositeAccount(asan, Currency.USD);
        CreditAccount asanCreditAccount = new CreditAccount(asan, Currency.EUR);

        asan.addAccount(asanDepositAccount);
        asan.addAccount(asanCreditAccount);

        System.out.println(asan.getClientID());

        clients.put(asan.getClientID(), asan);

        System.out.println("===========Welcome to MBank=============");
        System.out.println("Please enter client ID");
        String clientID = scanner.nextLine();
        Client client = clients.get(clientID);
    }
    private static BankAccaunt findAccount(String accountNumber){
        for (Client client : clients.values()) {
            for (BankAccaunt bankAccount : client.getAccounts()) {
                if (bankAccount.getAccountNumber().equals(accountNumber)) {
                    return bankAccount;
                }
            }
        }
        return null;
    }
}
