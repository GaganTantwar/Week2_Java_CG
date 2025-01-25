package com.tit.javainheritance.hierarchicalinheritance.bankdetails;

public class SavingsAccount extends BankAccount {
    protected int interestRate;
    protected static String accountType = "Saving Account";

    // Constructor to initialize SavingsAccount details
    public SavingsAccount(long accountNumber, double balance, int interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Overriding the displayAccountType method for SavingsAccount
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: " + accountType);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
