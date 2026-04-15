package com.restaurant.bt02;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @PostMapping("/hr/add-employee")
    public String saveEmployee(
            @Valid @ModelAttribute("employee") EmployeeDto employee,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "employee-form";
        }

        return "redirect:/hr/success";
    }
}