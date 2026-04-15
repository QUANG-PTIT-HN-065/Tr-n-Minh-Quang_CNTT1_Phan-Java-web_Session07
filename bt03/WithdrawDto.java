package com.restaurant.bt03;

import jakarta.validation.constraints.NotNull;

// bài 3
public class WithdrawDto {
    @NotNull(message = "Số tiền không được để trống")
    @MultipleOfTenThousand
    private Long withdrawAmount;
    public Long getWithdrawAmount() {
        return withdrawAmount;
    }
    public void setWithdrawAmount(Long withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
