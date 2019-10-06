package com.mycompany.projeto.swing.encapsulamento;

public class ContaCorrente {
    
    private Double saldo = 0.0;
    private Integer operacoes = 0;
     
    public void depositar15(){
        saldo += 15;
        operacoes++;
    }
    
    public void sacar5(){
        saldo -= 5;
        operacoes++;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    public Integer getOperacoes(){
        return operacoes;
    }
}
