package com.mycompany.poo1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Poo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = JOptionPane.showInputDialog(null, "Digite um número: ");
        int num = Integer.parseInt(s);
        
        if(num % 2 == 0) {
            JOptionPane.showMessageDialog(null, s + " é par");
        } else {
            JOptionPane.showMessageDialog(null, s + " é impar");
        }
        
        System.out.print("Digite nota 1: ");
        int note1 = sc.nextInt();
        
        System.out.print("Digitre note 2: ");
        int note2 = sc.nextInt();
        
        int note = note1 + note2;
        
        if(note % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É impar!");
        }
        
    }
}
