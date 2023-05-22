/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication2;

/**
 *
 * @author Bromean
 */
public class Account {

    private int accountNumber;
    private String accountName;
    private double balance;

    public Account(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    
    public void deposit(double amount){
        this.balance = this.balance+amount;
    }
    
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public int getAccountNumber(){
        return this.accountNumber;
    }
    
    public String getAccountName(){
        return this.accountName;
    }
}
