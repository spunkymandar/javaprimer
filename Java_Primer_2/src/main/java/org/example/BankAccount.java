package org.example;

public class BankAccount {
    int accountId;
    String accountHodlerName;
    static int totalAccounts;

    public BankAccount(String accountHodlerName, int accountId) {
        this.accountHodlerName = accountHodlerName;
        this.accountId = accountId;
        totalAccounts+=1;

    }

    public static int getTotalAccounts(){
        return totalAccounts;
    }
}
