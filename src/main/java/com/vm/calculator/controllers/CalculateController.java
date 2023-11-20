package com.vm.calculator.controllers;

import com.vm.calculator.dao.CalculatorDAO;
import com.vm.calculator.model.Calculator;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculateController {

    @ModelAttribute("calculator")
    public Calculator getCalculator() {
        return new Calculator();
    }


    @GetMapping(value = "/get")
    public String getForm() {
        return "res/calc";
    }

    @PostMapping(value = "/res")
    public String getResult(@ModelAttribute("calculator") @Valid Calculator calculator, BindingResult bindingResult, Model model,
                            CalculatorDAO calculatorDAO) {
        model.addAttribute("result", calculatorDAO.getCalculator(calculator));
        if ((calculator.getA() == null || calculator.getB() == null || !calculator.getAction().matches("[+-/*]"))) {
            return "redirect:/get";
        }
        return "res/result";
    }
}
