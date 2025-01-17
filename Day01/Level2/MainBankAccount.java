import java.util.*; // Importing the all classes form util

// Class representing a bank account
class BankAccount {
    private String accountHolder; // Name of the account holder
    private int accountNumber; // Account number
    private double balance; // Account balance

    // Constructor to initialize the bank account
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void depositeMoney(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withDrawMoney(double amount) {
        if(balance>=500){ //cheking minimum balance 
            balance-=amount;
         }
         else{
          System.out.println("Please Maintain Minimum Balance");
          
         }
        
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Name of the Account Holder: " + accountHolder);
        System.out.println("Account Number of the Account Holder: " + accountNumber);
        System.out.println("Balance of the Account: " + balance);
    }
}

// Main class to interact with the bank account
public class MainBankAccount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        // Prompting user for account details
        System.out.println("Enter Name of the Account Holder: ");
        String accountHolder = sc.nextLine();
        System.out.println("Enter Account Number of the Person: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter Account Balance: ");
        double balance = sc.nextDouble();
        System.out.println("Enter Amount for Withdraw: ");
        double amountW = sc.nextDouble();
        System.out.println("Enter Amount for Deposit: ");
        double amountD = sc.nextDouble();

        // Creating a BankAccount object with user-provided details
        BankAccount banker = new BankAccount(accountHolder, accountNumber, balance);

        // Performing deposit and withdrawal operations
        banker.depositeMoney(amountD);
        banker.withDrawMoney(amountW);
        // Displaying account details
        banker.displayDetails();

        sc.close(); // Closing the Scanner object
    }
}
