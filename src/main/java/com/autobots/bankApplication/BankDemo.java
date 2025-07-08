package com.autobots.bankApplication;

public class BankDemo {
    public static void main(String[] args) throws Exception {

        MBank alliaMbank = new MBank(123456789111l, 444444444);


        System.out.println(alliaMbank.getBalance());
        alliaMbank.deposit(100000);
        System.out.println("____________");
        System.out.println(alliaMbank.getBalance());




        Optima ulugbekOptima = new Optima(123456789122l,555555555);

        System.out.println(ulugbekOptima.getBalance());


        Bank.transferFunds(alliaMbank, ulugbekOptima,500);


        Demir zinaidaDemir = new Demir(123333344555L,666666666);
        System.out.println(zinaidaDemir);


        BankBase.allBankRecords.stream().filter(n -> n.getBalance() > 100).forEach(System.out::println);

        double allSumOfBanks = BankBase.allBankRecords.stream().mapToDouble(Bank::getBalance).sum();
        System.out.println(allSumOfBanks);

    }
}
