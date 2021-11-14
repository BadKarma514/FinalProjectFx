/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import java.util.ArrayList;

/**
 *
 * @author adamoughourlian
 */
public class Account {
    protected static int counter = 0 ;
    protected int ID;
    protected String type;
    protected double balance;
    protected ArrayList<Transaction> transactionList;
    protected ArrayList<Account> accountList = new ArrayList();
    
    public Account() {
        counter++;
        this.ID = counter;
        String type = this.type;
        this.transactionList = new ArrayList();
    }
    
    public void createAccount(){
        accountList.add(new Account());
    }
    
    public void deposit(double d){
        this.balance = this.balance + d;
        this.transactionList.add(new Transaction("Deposit", d));
    }
    
    public void displayAllTransactions() {
        for(int i=0; i<transactionList.size(); i++){
            System.out.println(transactionList.get(i));
        }
    }
    
    public void withdraw(double w){
        int action = 0;
        while(action !=2){
            
        if(w > this.balance){
            
            action = 1;
            
        } else action = 2;
        
        switch (action){
                case 1:
                    System.out.println("You do not have enough money for this transaction.");
                    break;
                case 2:
                    this.balance = this.balance - w;
                    this.transactionList.add(new Transaction("Withdraw", w));
                    break;
        }
        }
    }
    
    public double seeTotal(){
        double a;
        for(int i=0; i<accountList.size(); i++){
            a = accountList.get(i).getBalance();     
            balance = balance + a;
        }
        return balance;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getCounter() {
        return counter;
    }
    
    
}
