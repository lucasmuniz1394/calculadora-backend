package com.adotea.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.adotea.calculadora.controller")
public class CalculadoraBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculadoraBackendApplication.class, args);
    }
}
