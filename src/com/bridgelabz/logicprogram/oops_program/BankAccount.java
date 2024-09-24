package com.bridgelabz.logicprogram.oops_program;

public class BankAccount {

    // Instance variables
    private double balance;
    private int accountNumber;

    // Constructor to initialize BankAccount object
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Available balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }

    // Method to print account details
    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a BankAccount object with an initial balance
        BankAccount account = new BankAccount(123456, 1000);

        // Print initial account details
        account.printAccountDetails();

        // Deposit and withdraw money
        account.deposit(500);   // Deposits $500
        account.withdraw(300);  // Withdraws $300
        account.withdraw(1500); // Tries to withdraw $1500 (should fail due to insufficient funds)
    }
}
