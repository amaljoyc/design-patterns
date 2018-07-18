package com.amaljoyc.patterns.structural.facade;

/**
 * Created by amaljoyc on 19.07.18.
 */
public class BankingService {

    public void createAccount(AccountType type) {
        Account account = null;
        if (type == AccountType.SAVINGS) {
            account = new SavingsAccount();
        } else if (type == AccountType.CURRENT) {
            account = new CurrentAccount();
        }

        if (account != null) {
            account.create();
        }
    }
}
