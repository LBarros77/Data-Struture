package com.company.codes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

public class BackendMarket {
    private final HashMap<String, Double> dictionary;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> choices = new ArrayList();
    
    public BackendMarket () {
        dictionary = new HashMap();
    }
    
    public void setAutoStorage() {
        String products[] = {"Produto 1", "Produto 2", "Produto 3", "Produto 4", "Produto 5"};
        Double prices[] = {2.98, 4.50, 9.95, 4.49, 6.87};
        
        for(int i = 0; i < products.length; i++) {
            this.dictionary.put(products[i], prices[i]);
        }
    }
    
    public void showDictionary() {
        this.setAutoStorage();
        System.out.println("-------- Produtos ---------");
        
        for(String k: dictionary.keySet()) {
            System.out.println(k);
        }
        
        System.out.println("-------- ######## ---------");
        System.out.println();
    }
    
    public void choiceDictionary() {
        int number = 0;
        int quantitie = 0;
        System.out.println("Para encerrar digite 0");
        
        do {
            try {
                System.out.print("Digite um número correspondente ao produto: ");
                number = sc.nextInt();
                if(number != 0) {
                    System.out.print("Digite a quantidade de produtos: ");
                    quantitie = sc.nextInt();
                    this.management(number, quantitie);
                }
            } catch(Exception e) {
                System.out.println("Erro: " + e);
            }
        } while(number != 0);
        
        for(String k: dictionary.keySet()) {
            System.out.println(k + ": " + dictionary.get(k));
        }
        
        System.out.println("\n" + dictionary.values());
//        System.out.println("Total: " + this.sum(dictionary.values()));
    }
    
    public void management(int index, int quantitie) {
        String key = "Produto " + index;
        
        switch(index) {
            case 1:
                dictionary.replace(key, dictionary.get(key), dictionary.get(key) * quantitie);
                break;
            case 2:
                dictionary.replace(key, dictionary.get(key), dictionary.get(key) * quantitie);
                break;
            case 3:
                dictionary.replace(key, dictionary.get(key), dictionary.get(key) * quantitie);
                break;
            case 4:
                dictionary.replace(key, dictionary.get(key), dictionary.get(key) * quantitie);
                break;
            case 5:
                dictionary.replace(key, dictionary.get(key), dictionary.get(key) * quantitie);
                break;
            default:
                System.out.print("OK");
        }
    }
    
    public Double sum(double[] values) {
        Double value = 0.0;
        
        for(Double v: values) {
            value += v;
        }
        
        return value;
    }
    
    public void setDictionary(String key, Double value) {
        this.dictionary.put(key, value);
    }

    public HashMap<String, Double> getDictionary() {
        return dictionary;
    }
}
