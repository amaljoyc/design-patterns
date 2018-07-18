package com.amaljoyc.patterns.structural.facade;

/**
 * Created by amaljoyc on 19.07.18.
 */
public class Main {

    public static void main(String[] args) {
        BankingService service = new BankingService();
        service.createAccount(AccountType.CURRENT);
        service.createAccount(AccountType.SAVINGS);
    }
}
