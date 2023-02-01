package BankAccount;

import java.util.*;

// Class to represent a Bank Account
class BankAccount {
    private int accountNumber;   // Unique identifier for the account
    private String accountHolderName;  // Name of the account holder
    private double balance;   // Balance in the account

    // Constructor to initialize the Bank Account with account number, account holder name and balance
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter method for account number
    public int getAccountNumber() {
        return this.accountNumber;
    }

    // Getter method for account holder name
    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    // Getter method for balance
    public double getBalance() {
        return this.balance;
    }

    // Method to deposit an amount in the account
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

