package com.company.codes;

import java.util.ArrayList;

public class GraphicBarCode {
    private ArrayList<Integer> numbers = new ArrayList();
    private int totNumbers = 0;
    
    public GraphicBarCode() {
//        this.numbers = 
//        this.totNumbers = 0;
    }
    
    public void addNumber(int index, int number) {
        this.numbers.add(index, number);
        this.totNumbers++;
    }
    
    public void addNumber(int number) {
        this.numbers.add(number);
        this.totNumbers++;
        // It's repited number (1)
        System.out.println(this.numbers);
//        System.out.println(this.numbers.size());
//        System.out.println(this.totNumbers);
    }
    
    public String convertNumber(int number) {
        String str = "";
        
        for(int i = 0; i < number; i++) {
            str += "*";
        }
        
        return str;
    }
    
    public String convertNumberAll() {
        String str = "";
        
        for(int i = 0; i < this.getTotNumbers(); i++) {
            str += convertNumber(this.numbers.get(i)) + "\n";
        }
        
        return str;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

//    public void setNumbers(ArrayList<Integer> numbers) {
//        this.numbers = numbers;
//        this.totNumbers = this.numbers.length;
//    }
    
    public int getTotNumbers() {
        return this.totNumbers;
    }
    
    public void setTotNumber(int number) {
        this.totNumbers = number;
    }
}
