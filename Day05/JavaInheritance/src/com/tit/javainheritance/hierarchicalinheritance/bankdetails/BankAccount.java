package com.tit.javainheritance.hierarchicalinheritance.bankdetails;

public class BankAccount {
    protected long accountNumber;
    protected double balance;

    // Constructor to initialize BankAccount details
    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountType() {
        System.out.println("Account Number of Customer: " + accountNumber);
        System.out.println("Balance of the Account: " + balance);
    }
}
