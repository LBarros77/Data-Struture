package com.mycompany.megasena;

import java.util.ArrayList;

public class Calc {
    private ArrayList<String> numbers = new ArrayList<String>();
    private int total;
    private int min;
    private int max;
    
    public void Calculo(int total) {
        this.total = total;
    }
    
//    public void setNumber(String number) {
//        if(this.verifyNumber(number)) {
//            this.number.add(number);
//        }
//    }
//    
//    public boolean verifyNumber(String number) {
//        if(number.length() >= 6 && number.length <= 15) {
//            return true;
//        }
//        return false;
//    }
}
