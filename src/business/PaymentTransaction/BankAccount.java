/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.PaymentTransaction;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class BankAccount {
    private String accountNumber;
    private float balance;
    private ArrayList<Transaction> transaction;
    
    public BankAccount(String accNumber){
        this.accountNumber = accNumber;
        transaction = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(ArrayList<Transaction> transaction) {
        this.transaction = transaction;
    }
    
    

    @Override
    public String toString() {
        return accountNumber;
    }
    
    
}
