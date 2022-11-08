package com.mycompany.listasestaticas;

public class App {

    public static void main(String[] args) {
   
        Vector list = new Vector(10);
        
        list.add("Salgueiro");
        list.add("Berlim");
        list.add("element");
        list.add("Berlim");
        list.add("element");
        
        System.out.println(list.printEndPosition("element"));
        
//        System.out.println(list.toString());
//
//        System.out.println(list.search(1));
//        System.out.println(3 % 2);
    }
}
