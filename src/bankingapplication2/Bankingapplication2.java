/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bromean
 */
public class Bankingapplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank();
        Account account;
        int option = 0, accountNumber;
        String accountName;
        double balance, amount;
        while (option != 6) {
            System.out.println("Main Menu");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Open New Account");
            System.out.println("3. Close Existing Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Exit");
            System.out.println();
            
            System.out.print("Enter your choice: ");
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    bank.listAccount();
                    break;
                case 2:
                    System.out.print("Enter Account Name: ");
                    accountName = scan.nextLine();
                    System.out.print("Enter Account Balance: ");
                    balance = scan.nextDouble();
                    accountNumber = genAccountNumber();
                    account = new Account(accountNumber, accountName, balance);
                    bank.openAccount(account);
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scan.nextInt();
                    scan.nextLine();
                    bank.closeAccount(accountNumber);
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Amount: ");
                    amount = scan.nextDouble();
                    bank.depositMoney(accountNumber, amount);
                    break;
                case 5:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Amount: ");
                    amount = scan.nextDouble();
                    bank.withdrawMoney(accountNumber, amount);
                    break;
            }
            System.out.println();
        }
    }
    
    public static int genAccountNumber(){
        Random rand = new Random();
        int accNumber = 100000 + rand.nextInt(900000);
        return accNumber;
    }

}
