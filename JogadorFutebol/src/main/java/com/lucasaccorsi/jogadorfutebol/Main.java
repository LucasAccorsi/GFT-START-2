package com.lucasaccorsi.jogadorfutebol;

import java.util.Calendar;

/* @author lucas */

public class Main {
    public static void main(String[] args) {
        Calendar dateFormater1 = Calendar.getInstance();
        Calendar dateFormater2 = Calendar.getInstance();
        Calendar dateFormater3 = Calendar.getInstance();
        
        dateFormater1.set(1995, 7, 13);
        dateFormater2.set(1990, 2, 1);
        dateFormater3.set(2000, 3, 20);
        
        Jogador defensor = new Jogador("Adriano", "defesa", dateFormater1);
        Jogador meia = new Jogador("Zico", "meio-campo", dateFormater2);
        Jogador atacante = new Jogador("Pele", "atacante", dateFormater3);
        
        System.out.println(defensor.toString());
        System.out.println(defensor.aposentar());
        System.out.println(meia.toString());
        System.out.println(meia.aposentar());
        System.out.println(atacante.toString());
        System.out.println(atacante.aposentar());
    }
}
