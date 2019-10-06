package com.mycompany.projeto.swing.encapsulamento;

public class UrnaEletronica {
   private Integer votosG = 0;
   private Integer votosS = 0;
   private Integer resultado = 0;
   private String frase;
   
   public void gryffindor(){
      if(resultado <10){
      votosG++;
      resultado++;
      }
   } 
   
   public void slytherin(){
       if(resultado <10){
       votosS++;
       resultado++;
       }
   }

    public Integer getVotosG() {
        return votosG;
    }

    public Integer getVotosS() {
        return votosS;
    }

    public Integer getResultado() {
        if(votosG == votosS){
            
        } 
        return resultado;
    }
   
    
   public void soma(){
       if ((votosG + votosS)>=10){
           if(votosG == votosS){
            frase = "Empate! Vamos ao 2º Turno.";
           }
           else if (votosG > votosS){
            frase = " venceu!";
           }
       }
    }
}
