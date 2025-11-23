package com.adotea.calculadora.dto;

public class CalculationRequest {
    private double initialValue;
    private double monthlyContribution;
    private double interestRate;
    private int months;
    
    public double getInitialValue(){
        return initialValue;
    }

    public void setInitialValue(double initialValue){
        this.initialValue = initialValue;
    }

    public double getMonthlyContribution(){
        return monthlyContribution;
    }

    public void setMonthlyContribution(double monthlyContribution){
    this.monthlyContribution = monthlyContribution;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate ;
    }

    public int getMonths(){
        return months;
    }
    public void setMonths(int months){
        this.months = months;
    }
}
