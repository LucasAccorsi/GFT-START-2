package com.lucasaccorsi.banco;

/* @author lucas */

public class Main {
    public static void main(String[] args) {
        ContaCorrente pessoa1 = new ContaCorrente(1, "Lucas", 5000.00);
        ContaPoupanca pessoa2 = new ContaPoupanca(1, "Alisson", 3000.00);
        
        System.out.println("Rendimento: " + pessoa1.rendimento());
        System.out.println("Rendimento: " + pessoa2.rendimento());
        
    }
}
