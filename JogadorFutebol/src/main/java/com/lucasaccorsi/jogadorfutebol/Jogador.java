package com.lucasaccorsi.jogadorfutebol;

import java.util.Calendar;

/* @author lucas */

public class Jogador {
    
    private String nome;
    private String posicao;
    private Calendar dataNacimento;
    
    public void Jogador(){}

    public Jogador(String nome, String posicao, Calendar dataNacimento) {
        super();
        this.nome = nome;
        this.posicao = posicao;
        this.dataNacimento = dataNacimento;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", posicao=" + posicao + ", dataNacimento=" +dataNacimento.get(Calendar.DAY_OF_MONTH) + "/" + dataNacimento.get(Calendar.MONTH) + "/" +dataNacimento.get(Calendar.YEAR) + '}';
    }
    
    public int idade(){
        Calendar hoje = Calendar.getInstance();
        return hoje.get(Calendar.YEAR) - dataNacimento.get(Calendar.YEAR);
    }
    
    public int aposentar(){
        
        if (this.posicao == "defesa"){
            return 40 - idade();
        }else if(this.posicao == "meio-campo"){
            return 38 - idade();
        }else{
            return 35 - idade();
        }
        
    }
    
}
