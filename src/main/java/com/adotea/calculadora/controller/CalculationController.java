package com.adotea.calculadora.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adotea.calculadora.dto.CalculationRequest;
import com.adotea.calculadora.dto.CalculationResponse;
import com.adotea.calculadora.service.CalculationService;

@RestController
@RequestMapping("/api")
public class CalculationController {

    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("ok");
    }
    
    @PostMapping("/calculate")
    public ResponseEntity<CalculationResponse> calculate(@RequestBody CalculationRequest request) {
        CalculationResponse resp = calculationService.calculate(request);
        return ResponseEntity.ok(resp);
    }
}
