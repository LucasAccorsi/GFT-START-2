package com.lucasaccorsi.papainoel;

/* @author lucas */

public class Main {
    public static void main(String[] args) {
        
        Crianca[] crianca = new Crianca[5];
        int presentes = 0;
        
        crianca[0] = new Crianca("Aurora", "boazinha");
        crianca[1] = new Crianca("Luciano", "malvada");
        crianca[2] = new Crianca("Gabrielly", "boazinha");
        crianca[3] = new Crianca("Marcio", "boazinha");
        crianca[4] = new Crianca("Moises", "malvada");
        
        for (int i = 0; i < crianca.length; i++){
            if (crianca[i].presente()) {
                presentes++;
            }
        }
        
        System.out.println("presentes entreges: " + presentes);
        System.out.println("presentes não entreges: " + (crianca.length - presentes));
    }
}
