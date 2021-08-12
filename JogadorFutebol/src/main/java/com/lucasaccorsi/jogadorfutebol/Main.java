package com.lucasaccorsi.jogadorfutebol;

import java.time.LocalDate;

/* @author lucas */

public class Main {
    public static void main(String[] args) {
        LocalDate dateFormater;
        
        dateFormater = LocalDate.of(1995, 7, 13);
        Jogador defensor = new Jogador("Adriano", "defesa", dateFormater);
        
        dateFormater = LocalDate.of(1990, 2, 1);
        Jogador meia = new Jogador("Zico", "meio-campo", dateFormater);
        
        dateFormater = LocalDate.of(2000, 3, 20);
        Jogador atacante = new Jogador("Pele", "atacante", dateFormater);
        
        System.out.println(defensor.toString());
        System.out.println("Anos para aposentadoria: " + defensor.aposentar());
        
        System.out.println(meia.toString());
        System.out.println("Anos para aposentadoria: " + meia.aposentar());
        
        System.out.println(atacante.toString());
        System.out.println("Anos para aposentadoria: " + atacante.aposentar());
    }
}
