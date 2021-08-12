package com.lucasaccorsi.banco;

/* @author lucas */

public class ContaCorrente extends Conta{

    ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public double rendimento(){
        return getSaldo() * 0.05;
    }
}
