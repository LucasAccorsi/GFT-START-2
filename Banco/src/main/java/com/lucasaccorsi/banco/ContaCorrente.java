package com.lucasaccorsi.banco;

/* @author lucas */

public class ContaCorrente extends Conta{

    ContaCorrente(int i, String nome, double d) {
        super(i, nome, d);
    }

    public double rendimento(){
        return getSaldo() * 0.05;
    }
}
