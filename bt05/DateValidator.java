package com.restaurant.bt05;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
public class DateValidator implements ConstraintValidator<ValidDate, TourDto> {

    @Override
    public boolean isValid(TourDto dto, ConstraintValidatorContext context) {

        if (dto == null) return true;

        LocalDate start = dto.getStartDate();
        LocalDate end = dto.getEndDate();

        if (start == null || end == null) return true;

        if (start.isBefore(LocalDate.now())) return false;

        return end.isAfter(start);
    }
}