package com.lucasaccorsi.mesada;

/* @author lucas */

public class Mesada {

    private double valor;
    private double procentagemDevolucao;

    public Mesada() {}
    
    public Mesada(double valor) {
        super();
        this.valor = valor;
        this.procentagemDevolucao = 0.005;
    }

    protected void setProcentagemDevolucao(double procentagemDevolucao) {
        this.procentagemDevolucao = procentagemDevolucao;
    }
    
    public void pagar(double valor){
        this.valor += valor;
    }
    
    public double saque(double valor){
        this.valor = this.valor - valor;
        return valor * this.procentagemDevolucao;
    }
    
    public double saldo(){
        return this.valor;
    }
}