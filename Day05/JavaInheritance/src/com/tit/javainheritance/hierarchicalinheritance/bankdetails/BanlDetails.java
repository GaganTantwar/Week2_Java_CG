package com.tit.javainheritance.hierarchicalinheritance.bankdetails;

public class BanlDetails {
    public static void main(String args[]) {
        // Creating an instance of SavingsAccount
        BankAccount saving = new SavingsAccount(1233656515652L, 5005.23, 5);
        saving.displayAccountType();
        System.out.println(" ");

        // Creating an instance of CheckingAccount
        BankAccount current = new CheckingAccount(1456237891545L, 4123.21, 100000);
        current.displayAccountType();
    }
}
