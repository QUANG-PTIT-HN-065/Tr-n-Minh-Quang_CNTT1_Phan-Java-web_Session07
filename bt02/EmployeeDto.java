package com.restaurant.bt02;

import jakarta.validation.constraints.*;

public class EmployeeDto {

    @NotNull(message = "Tuổi không được để trống")
    @Min(value = 18, message = "Tuổi phải từ 18 trở lên")
    @Max(value = 60, message = "Tuổi không được quá 60")
    private Integer age;

    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;

    public EmployeeDto() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
