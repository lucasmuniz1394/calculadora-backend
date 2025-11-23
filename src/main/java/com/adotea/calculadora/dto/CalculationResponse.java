package com.adotea.calculadora.dto;

public class CalculationResponse {
    private double finalvalue;

    public CalculationResponse(double finalvalue){
        this.finalvalue = finalvalue;
    }
     public double  getFinalValue(){
     return finalvalue;
}
     public double getFinalvalue() {
         return finalvalue;
     }
     public void setFinalvalue(double finalvalue) {
         this.finalvalue = finalvalue;
     }
}