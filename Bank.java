
package com.mycompany.bank;

import java.util.ArrayList;
import java.util.Optional;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;


    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

 
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

  
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

   
    @Override
    public String toString() {
        return "AccountNumber: " + accountNumber + ", AccountHolder: " + accountHolder + ", Balance: " + balance;
    }
}

class Bank {
    private ArrayList<Account> accounts;

 
    public Bank() {
        accounts = new ArrayList<>();
    }


    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account);
    }

 
    public void removeAccount(String accountNumber) {
        Optional<Account> accountToRemove = accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst();
        if (accountToRemove.isPresent()) {
            accounts.remove(accountToRemove.get());
            System.out.println("Account removed: " + accountToRemove.get());
        } else {
            System.out.println("Account not found.");
        }
    }

 
    public void deposit(String accountNumber, double amount) {
        Optional<Account> account = accounts.stream()
                .filter(a -> a.getAccountNumber().equals(accountNumber))
                .findFirst();
        if (account.isPresent()) {
            account.get().deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

   
    public void withdraw(String accountNumber, double amount) {
        Optional<Account> account = accounts.stream()
                .filter(a -> a.getAccountNumber().equals(accountNumber))
                .findFirst();
        if (account.isPresent()) {
            account.get().withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

   
    public static void main(String[] args) {
        Bank bank = new Bank();

       
        Account account1 = new Account("123456", "HARLIN", 500.00);
        Account account2 = new Account("789012", "MATTY", 1000.00);

        
        bank.addAccount(account1);
        bank.addAccount(account2);

     
        bank.deposit("123456", 150.00);
        bank.withdraw("123456", 50.00);

     
        bank.withdraw("123456", 1000.00);

       
        bank.removeAccount("789012");

       
        bank.removeAccount("000000");
    }
}
