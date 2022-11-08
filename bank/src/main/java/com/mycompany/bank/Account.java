package com.mycompany.bank;

import java.util.Scanner;

public class Account extends Pessoa {
    private String number;
    private String type;
    private String titular;
    private float balance = 0.0f;
    private boolean status;
    private String password;

//    public Account(String number, String type, String titular, float balance, boolean status) {
//        this.number = number;
//        this.type = type;
//        this.titular = titular;
//        this.balance = balance;
//        this.status = status;
//    }
    
    public Account(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.status = false;
    }
    
    public void openAccount() {
        Scanner sc = new Scanner(System.in);
        this.setStatus(true);
        System.out.print("Insert type account: ");
        this.setType(sc.nextLine());
    }
    
    public void clouseAccount() {
        if(this.getBalance() == 0.0f && this.getStatus() == true) {
            this.setStatus(false);
        }
    }
//    deposite() {}
    public float withdraw(float value) {
        return (this.getBalance() > value)? value : 0.0f;
    }
    
    public void mounthPayment() {
        if(this.getType().contentEquals("CC")) {
            this.setBalance(this.getBalance() - 20);
        }
        this.setBalance(this.getBalance() - 12);
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getTitular() {
        return titular;
    }

    public float getBalance() {
        return this.balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(String type) {
        if(type.contentEquals("CC")){
            this.type = type;
            this.setBalance(50.0f);
        }
        this.type = type;
        this.setBalance(150.0f);
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    
}
