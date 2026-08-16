package com.filipecabral.controllers;

import com.filipecabral.services.SimpleMathService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private final SimpleMathService mathService;

    public MathController(SimpleMathService mathService) {
        this.mathService = mathService;
    }

    //http://localhost:8080/math/sum/3/5
    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum (
            @PathVariable Double numberOne,
            @PathVariable Double numberTwo
    ) {
        return mathService.sum(numberOne, numberTwo);
    }

    //http://localhost:8080/math/subtraction/3/5
    @GetMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction (
            @PathVariable Double numberOne,
            @PathVariable Double numberTwo
    ) {
        return mathService.subtraction(numberOne, numberTwo);
    }

    //http://localhost:8080/math/multiplication/3/5
    @GetMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication (
            @PathVariable Double numberOne,
            @PathVariable Double numberTwo
    ) {
        return mathService.multiplication(numberOne, numberTwo);
    }

    //http://localhost:8080/math/division/3/5
    @GetMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable Double numberOne,
            @PathVariable Double numberTwo
    ) {
        return mathService.division(numberOne, numberTwo);
    }

    //http://localhost:8080/math/mean/3/5
    @GetMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean (
            @PathVariable Double numberOne,
            @PathVariable Double numberTwo
    ) {
        return mathService.mean(numberOne, numberTwo);
    }

    //http://localhost:8080/math/squareRoot/81
    @GetMapping("/squareRoot/{number}")
    public Double squareRoot (
            @PathVariable Double number
    ) {
        return mathService.squareRoot(number);
    }
}

