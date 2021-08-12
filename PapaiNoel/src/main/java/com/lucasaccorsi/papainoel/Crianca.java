package com.lucasaccorsi.papainoel;

/* @author lucas */

public class Crianca {
    
    private String nome;
    private String personalidade;

    public Crianca() {}

    public Crianca(String nome, String personalidade) {
        super();
        this.nome = nome;
        this.personalidade = personalidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPersonalidade() {
        return personalidade;
    }
    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }
    
    public boolean presente(){
        
        if (getPersonalidade() == "boazinha"){
            return true;
        }
        return false;
    }
    
}
