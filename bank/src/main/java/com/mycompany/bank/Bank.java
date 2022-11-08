package com.mycompany.bank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account("Ronald", 19, "password");
        
        
        System.out.println("Insert type account: ");
        account.setType("CC");
        
        // CC = current account
        // CP = poup account
    }
}
