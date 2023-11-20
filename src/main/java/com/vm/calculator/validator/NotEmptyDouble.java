package com.vm.calculator.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = NotEmptyDoubleValidator.class)
@Documented
@interface  NotEmptyDouble {
    String message() default "The field not should be empty";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
