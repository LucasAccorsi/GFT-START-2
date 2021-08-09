package com.lucasaccorsi.banco;

/* @author lucas */

public class ContaPoupanca extends Conta{

    ContaPoupanca(int i, String nome, double d) {
        super(i, nome, d);
    }
    
    public double rendimento(){
        return getSaldo() * 0.07;
    }
}
