package com.lucasaccorsi.banco;

/* @author lucas */

public class Conta {

    private int numero;
    private String titular;
    private double Saldo;

    public Conta() {}

    public Conta(int numero, String titular, double Saldo) {
        super();
        this.numero = numero;
        this.titular = titular;
        this.Saldo = Saldo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return Saldo;
    }
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    public double rendimento(){
        return Saldo;
    }
}
