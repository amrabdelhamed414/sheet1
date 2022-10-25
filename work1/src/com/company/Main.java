package com.company;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Account newAccount = new Account(1122, 20000);
        newAccount.setAnnualInterestRate(4.5);
        newAccount.withdraw(2500);
        newAccount.deposit(3000);
        System.out.println("Balance: " + newAccount.getBalance() + "\nMonthly Interest: " + newAccount.getMonthlyInterest() + "\nDate: "+ newAccount.getDateCreated());
    }
}

class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;

    public Account() {
        this.id=0;
        this.balance=0;
        this.annualInterestRate=0;
        this.dateCreated = LocalDate.now();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate=0;
        this.dateCreated = LocalDate.now();
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        return getMonthlyInterestRate()*balance/100.0;
    }

    public void withdraw(double money){
        this.balance -= money;
    }

    public void deposit(double money){
        this.balance += money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }
}