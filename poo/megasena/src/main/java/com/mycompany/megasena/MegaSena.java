package com.mycompany.megasena;

import java.util.Scanner;
import java.util.ArrayList;

public class MegaSena {
    // Gerear número randomico
    static int generateRandom(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min) + min);
    }
    // Retorna boolean [true se estiver entre 6 e 15]
    static boolean aroundNumber(int number) {
        return number >= 6 && number <= 15;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> gamesNumber = new ArrayList<>();
        ArrayList<String> games = new ArrayList<>();
        int min = 6;
        int max = 15;
        String variable;
        int indice = 1;

        System.out.print("Quantidade de jogos: ");
        int qtdGames = s.nextInt();

        while (qtdGames != 0) {
            int qtd = 0;
            try {
                System.out.print("Quantos números terá o " + indice + "º jogo: ");
                qtd = s.nextInt();
            } catch(Exception e) {
                qtdGames = 0;
            }
            
            if(aroundNumber(qtd)) {
                gamesNumber.add(qtd);
                qtdGames--;
                indice++;
            }
        }
     
        for (int num : gamesNumber) {
            String acomulator = "";
            while (!(num == 0)) {
                variable = Integer.toString(generateRandom(min, max));
                if(!acomulator.contains(variable)) {
                    acomulator += variable;
                    num--;
                }
            }
            games.add(acomulator);
        }
        
        System.out.println("\nOs seus jogos são: ");
        for(String game: games) {
            System.out.println(game);
        }
    }
}
