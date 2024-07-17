package model;

import service.AccountReference;

public abstract class Account extends AccountReference {
    private int branch = 1;
    private final int ACCOUNT_ID;
    private final Client CLIENT;
    private double balance = 0;

    public Account(Client client, double balance) {
        this.ACCOUNT_ID = newAccountID();
        this.CLIENT = client;
        this.balance = balance;
    }

    public int getBranch() {
        return branch;
    }
    public int getACCOUNT_ID() {
        return ACCOUNT_ID;
    }
    public Client getCLIENT() {
        return CLIENT;
    }
    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
    public boolean withdraw(double amount) {
        if(amount >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public boolean transfer(double amount, Account destination) {
        if(amount <= balance && destination.deposit(amount)) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
