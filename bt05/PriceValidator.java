package com.restaurant.bt05;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PriceValidator implements ConstraintValidator<ValidPrice, TourDto> {
    @Override
    public boolean isValid(TourDto dto, ConstraintValidatorContext context) {

        if (dto == null) return true;

        if (dto.getAdultPrice() == null || dto.getChildPrice() == null) {
            return true;
        }

        return dto.getChildPrice() <= dto.getAdultPrice();
    }
}