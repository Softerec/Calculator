package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);

        Calculator calc = new Calculator();
        System.out.println("How much is 5+5 ? " + calc.add(5,5));
        System.out.println("How much is 10-5 ? " + calc.sub(5,5));
    }

}
