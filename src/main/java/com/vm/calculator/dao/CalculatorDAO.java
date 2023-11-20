package com.vm.calculator.dao;

import com.vm.calculator.model.Calculator;

public class CalculatorDAO {
    public double getCalculator(Calculator calculator) {
        double result;
        double a = calculator.getA();
        double b = calculator.getB();
        String action = calculator.getAction();
        switch (action) {
            case "-":
                result = a - b;
                break;
            case "+":
                result = a + b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                result = 0;
        }
        return result;
    }
}
