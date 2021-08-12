package com.lucasaccorsi.jogadorfutebol;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/* @author lucas */

public class Jogador {
    
    private String nome;
    private String posicao;
    private LocalDate dataNacimento;
    
    public void Jogador(){}

    public Jogador(String nome, String posicao, LocalDate dataNacimento) {
        super();
        this.nome = nome;
        this.posicao = posicao;
        this.dataNacimento = dataNacimento;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome: " + nome + ", posicao: " + posicao + ", dataNacimento: " + dataNacimento + '}';
    }
    
    public long idade(){
        LocalDate hoje = LocalDate.now();
        return ChronoUnit.YEARS.between(this.dataNacimento, hoje);
    }
    
    public long aposentar(){
        
        if (this.posicao == "defesa"){
            return 40 - idade();
        }else if(this.posicao == "meio-campo"){
            return 38 - idade();
        }else{
            return 35 - idade();
        }
        
    }
    
}
