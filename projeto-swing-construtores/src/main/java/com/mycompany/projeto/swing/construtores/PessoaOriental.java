package com.mycompany.projeto.swing.construtores;


public class PessoaOriental {
        private String cor;
        private String densidadeOssea;
        private Double pesoMedio;

//MÉTODO CONSTRUTOR É INVOCADO QUANDO É CRIADO UM OBJETO DESTA CLASSE
    public PessoaOriental() {
        cor = "Parda";
        densidadeOssea = "Média-Baixa";
        pesoMedio = 3.1;
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
