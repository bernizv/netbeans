package com.mycompany.projeto.swing.construtores;

public class PessoaTransgenica {
        private String cor;
        private String densidadeOssea;
        private Double pesoMedio;

    public PessoaTransgenica(String cor, String densidadeOssea, Double pesoMedio) {
        this.cor = cor;
        this.densidadeOssea = densidadeOssea;
        this.pesoMedio = pesoMedio;
    }

    public String getCor() {
        return this.cor;
    }

    public String getDensidadeOssea() {
        return this.densidadeOssea;
    }

    public Double getPesoMedio() {
        return this.pesoMedio;
    }
    
}