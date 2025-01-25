package com.tit.javainheritance.hierarchicalinheritance.bankdetails;

public class CheckingAccount extends BankAccount {
    protected double withdrawalLimit;
    protected static String accountType = "Checking Account";

    // Constructor to initialize CheckingAccount details
    public CheckingAccount(long accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overriding the displayAccountType method for CheckingAccount
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: " + accountType);
        System.out.println("Withdrawal Limit of account: " + withdrawalLimit);
    }
}
