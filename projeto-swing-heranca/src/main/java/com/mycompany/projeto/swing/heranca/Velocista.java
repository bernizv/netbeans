package com.mycompany.projeto.swing.heranca;

public class Velocista extends Corredor{

    /*VELOCISTA É SUBCLASSE DE CORREDOR (OU CLASSE "DERIVADA") 
    E CORREDOR É SUPERCLASSE DE VELOCISTA*/
    public Velocista (){
        this.tipoFisico = "Musculo";
        this.performance = "Corre por alguns segundos";
        this.tempoMedio = 30.0;
    }

    
    
}
