package com.lucasaccorsi.banco;

/* @author lucas */

public class ContaPoupanca extends Conta{

    ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
    
    public double rendimento(){
        return getSaldo() * 0.07;
    }
}
