package com.adotea.calculadora.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

import com.adotea.calculadora.dto.CalculationRequest;
import com.adotea.calculadora.dto.CalculationResponse;

@Service
public class CalculationService {

    public CalculationResponse calculate(CalculationRequest req) {

        double P = req.getInitialValue();
        double PMT = req.getMonthlyContribution();
        int n = req.getMonths();
        double annualRatePercent = req.getInterestRate();

        if (n <= 0) {
            return new CalculationResponse(round(P, 2));
        }

        double monthlyRate = (annualRatePercent / 100.0) / 12.0;

        double fv;
        if (Math.abs(monthlyRate) < 1e-12) {
            fv = P + PMT * n;
        } else {
            double onePlusRpowN = Math.pow(1.0 + monthlyRate, n);
            double part1 = P * onePlusRpowN;
            double part2 = PMT * ((onePlusRpowN - 1.0) / monthlyRate);
            fv = part1 + part2;
        }

        return new CalculationResponse(round(fv, 2));
    }

    private double round(double value, int decimals) {
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(decimals, RoundingMode.HALF_EVEN);
        return bd.doubleValue();
    }
}
