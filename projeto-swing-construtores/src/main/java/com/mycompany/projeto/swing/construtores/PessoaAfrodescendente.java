package com.mycompany.projeto.swing.construtores;

public class PessoaAfrodescendente {
        private String cor;
        private String densidadeOssea;
        private Double pesoMedio;

    public PessoaAfrodescendente() {
        cor = "Negra";
        densidadeOssea = "Alta";
        pesoMedio = 3.8;
    }
    
    public String getCor() {
        return cor;
    }

    public String getDensidadeOssea() {
        return densidadeOssea;
    }

    public Double getPesoMedio() {
        return pesoMedio;
    }
    
        
}