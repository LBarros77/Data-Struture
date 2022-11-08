package com.mycompany.appagenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda extends Contact {
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    void addContact() {
        addDatas();
        
        contacts.add(this);
//        contacts.add(new Contact(
//                getId(),
//                getName(),
//                getPhone(),
//                getEmail()
//        ));
    }
    
    void addDatas() {
        
        int id = 1;
        while(contains(id) == true) {
            id = (int) Math.floor(Math.random() * (101 - 1) + 1);
        }
        
        setId(id);
            
        System.out.print("Adicionar nome: ");
        setName(sc.nextLine());

        System.out.print("Adicionar telefone: ");
        setPhone(sc.nextLine());

        System.out.print("Adiccionar E-mail: ");
        setEmail(sc.nextLine());
        
        System.out.println("Espaço insuficiente...");
    }
    
    @Override
    public String toString() {
        return contacts.toString();
    }
}
