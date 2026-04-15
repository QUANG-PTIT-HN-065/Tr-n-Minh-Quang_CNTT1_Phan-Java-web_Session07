package com.restaurant.bt05;

import jakarta.validation.*;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DateValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDate {
    String message() default "Ngày không hợp lệ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
