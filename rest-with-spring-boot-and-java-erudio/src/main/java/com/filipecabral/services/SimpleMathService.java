package com.filipecabral.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class SimpleMathService {

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo) {
        if (numberTwo == 0){
            throw new IllegalArgumentException("A divisão por zero não é permitida.");
        }
        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public Double squareRoot(Double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Não se pode calcular a raiz quadrada de um número negativo.");
        }
        return Math.sqrt(number);
    }
}
