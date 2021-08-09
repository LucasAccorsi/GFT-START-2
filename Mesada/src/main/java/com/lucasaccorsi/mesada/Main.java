package com.lucasaccorsi.mesada;

/* @author lucas */
public class Main {
    public static void main(String[] args) {
        
        Mesada filho = new Mesada(200);
        FilhoBom filhoBom = new FilhoBom(500);
        
        System.out.println("Valor a ser devolvido: " + filho.saque(100));
        System.out.println("Seu saudo é: " + filho.saldo());
        
        System.out.println("Valor a ser devolvido: " + filhoBom.saque(100));
        System.out.println("Seu saudo é: " + filhoBom.saldo());
    }
}
