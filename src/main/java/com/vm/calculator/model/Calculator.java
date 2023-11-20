package com.vm.calculator.model;

import jakarta.validation.constraints.*;

public class Calculator {
    @NotNull(message = "The field not should be empty")
    private Double a;
    @NotEmpty(message = "The field not should empty")
    private String action;
    @NotNull(message = "The field not should be empty")
    private Double b;

    public Calculator(Double a, String action, Double b) {
        this.a = a;
        this.action = action;
        this.b = b;
    }

    public Calculator() {
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = (a != null) ? a : 0.0;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = (b != null) ? b : 0.0;
    }
}