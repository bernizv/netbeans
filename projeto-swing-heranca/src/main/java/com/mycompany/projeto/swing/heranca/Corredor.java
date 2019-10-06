package com.mycompany.projeto.swing.heranca;

public class Corredor {
    
    //PROTECTED É QUASE COMO PRIVATE PORÉM, FICA DISPONÍVEL PARA AS HERANÇAS.
    protected String tipoFisico;
    protected String performance;
    protected Double tempoMedio;

    public String getPerformance() {
        return performance;
    }

    public Double getTempoMedio() {
        return tempoMedio;
    }

    public String getTipoFisico() {
        return tipoFisico;
    }
    
    
}
