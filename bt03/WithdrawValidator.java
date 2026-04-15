package com.restaurant.bt03;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class WithdrawValidator implements ConstraintValidator<MultipleOfTenThousand, Long> {
    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        if (value < 50000) {
            return false;
        }
        if (value % 10000 != 0) {
            return false;
        }
        return true;
    }
}