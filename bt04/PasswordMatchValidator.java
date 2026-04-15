package com.restaurant.bt04;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch, RegisterDto> {

    @Override
    public boolean isValid(RegisterDto dto, ConstraintValidatorContext context) {

        if (dto == null) return true;

        String password = dto.getPassword();
        String confirm = dto.getConfirmPassword();

        if (password == null || confirm == null) {
            return true;
        }

        return password.equals(confirm);
    }
}