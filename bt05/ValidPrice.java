package com.restaurant.bt05;

import jakarta.validation.*;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PriceValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPrice {
    String message() default "Giá trẻ em phải <= giá người lớn";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
