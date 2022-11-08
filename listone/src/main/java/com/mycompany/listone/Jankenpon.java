package com.mycompany.listone;

import java.util.Scanner;

public class Jankenpon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] choice, choiceMachine;
        choiceMachine = new int[3];
        choice = new int[3];
        int option = 0; int i = 0; int answer = 0;
        
        do {
            System.out.println("1- Pedra \n2- Papel \n3- Tesoura");
            try {
                System.out.print("Opção? ");
                option = sc.nextInt();
                if(option < 4 && option > 0) {
                    choiceMachine[i] = 1 + ((int) (Math.random() * 3));
                    choice[i] = option;
                    if(choiceMachine[i] < choice[i]) answer++;
                    i++;
                }
            } catch(Exception e) {
                System.out.println("Erro: " + e);
            }
        } while(i < choice.length);
        
        if(answer >= 2) {
            System.out.println("Voce ganhou!");
        } else {
            System.out.println("Você perdeu!");
        }
    }
    
}
