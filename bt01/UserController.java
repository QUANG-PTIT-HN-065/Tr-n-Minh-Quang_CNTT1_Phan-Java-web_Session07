package com.restaurant.bt01;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class UserController {
    @PostMapping("/update")
    public ResponseEntity<?> updateAddress(
            @Valid @RequestBody AddressDto addressDto,
            BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest()
                    .body(result.getAllErrors().get(0).getDefaultMessage());
        }

        return ResponseEntity.ok("Cập nhật địa chỉ thành công!");
    }
}
