package BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class to represent a Bank
class Bank {
    private static List<BankAccount> accounts = new ArrayList<BankAccount>();  // List of Bank Accounts

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        // Menu to let the user perform different actions
        while (choice != 4) {
            System.out.println("1. Add account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            // Perform the action based on the user's choice
            switch (choice) {
                case 1:
                    addAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        input.close();
    }

    // Method to add a Bank Account
    private static void addAccount() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();
        System.out.print("Enter account holder name: ");
        String accountHolderName = input.next();
        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();
        accounts.add(new BankAccount(accountNumber, accountHolderName, balance));
    }

    // Method to deposit in a Bank Account
    private static void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = input.nextDouble();
            account.deposit(amount);
            System.out.println("Deposit successful");
        } else {
            System.out.println("Account not found");
        }
    }

    // Method to withdraw money from a Bank Account
    private static void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number: ");

        int accountNumber = input.nextInt();
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = input.nextDouble();
            account.withdraw(amount);
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Account not found");
        }
    }


    // This is a method to retrieve a BankAccount object based on the account number
    private static BankAccount getAccount(int accountNumber) {
        // Loop through all BankAccount objects in the 'accounts' list
        for (BankAccount account : accounts) {
            // Check if the account number of the current BankAccount object matches the input account number
            if (account.getAccountNumber() == accountNumber) {
                // If a match is found, return the matching BankAccount object
                return account;
            }
        }
        // If no match is found, return null
        return null;
    }

}
