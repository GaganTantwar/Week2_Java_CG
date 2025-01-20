class BankAccount {
    // Private instance variable to store the account holder's name
    private String accountHolderName;
    // Final instance variable to store the account number (cannot be changed once assigned)
    private final long accountNumber;
    // Static variable to store the name of the bank (shared among all instances)
    public static String bankname = "State Bank Of India";
    // Static variable to keep track of the total number of accounts (shared among all instances)
    public static int totalaccount = 0;

    // Constructor to initialize the account holder's name and account number
    public BankAccount(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        // Increment the total number of accounts by 1 whenever a new account is created
        totalaccount += 1;
    }

    // Static method to print the total number of accounts in the bank
    public static void getTotalAccount() {
        System.out.println("Total Number of Accounts in the Bank: " + totalaccount);
    }

    // Method to display the account details
    public void display() {
        System.out.println("Name of the Account Holder: " + accountHolderName);
        System.out.println("Account Number of the Account Holder: " + accountNumber);
        System.out.println("Name of the Bank: " + bankname);
    }
}

public class BankDetails {
    public static void main(String args[]) {
        // Creating two instances of BankAccount with different account holder names and account numbers
        BankAccount account1 = new BankAccount("Ram Prasad", 598432175465L);
        BankAccount account2 = new BankAccount("Rajesh Singh", 984413784321L);

        // Checking if account1 is an instance of BankAccount and displaying its details
        if (account1 instanceof BankAccount) {
            System.out.println("account1 is an instance of BankAccount");
            account1.display();
        }
        System.out.print("\n");

        // Checking if account2 is an instance of BankAccount and displaying its details
        if (account2 instanceof BankAccount) {
            System.out.println("account2 is an instance of BankAccount");
            account2.display();
        }
        System.out.print("\n");

        // Calling the static method to print the total number of accounts in the bank
        BankAccount.getTotalAccount();
    }
}
