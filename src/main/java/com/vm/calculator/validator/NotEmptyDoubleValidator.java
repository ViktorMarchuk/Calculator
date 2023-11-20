package com.vm.calculator.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NotEmptyDoubleValidator implements ConstraintValidator<NotEmptyDouble,Double> {
    @Override
    public boolean isValid(Double value, ConstraintValidatorContext constraintValidatorContext) {
        return value != null;
    }
}
