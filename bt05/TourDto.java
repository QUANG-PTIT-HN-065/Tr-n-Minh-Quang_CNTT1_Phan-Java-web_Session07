package com.restaurant.bt05;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

@ValidPrice
@ValidDate
public class TourDto {
    @Pattern(regexp = "^(VN|INT)_\\d{5}$",
            message = "Mã tour phải dạng VN_12345 hoặc INT_12345")
    private String tourCode;
    @NotNull
    @Positive(message = "Giá người lớn phải > 0")
    private Double adultPrice;
    @NotNull
    @Positive(message = "Giá trẻ em phải > 0")
    private Double childPrice;
    @NotNull
    private LocalDate startDate;
    @NotNull
    private LocalDate endDate;

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    public Double getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(Double adultPrice) {
        this.adultPrice = adultPrice;
    }

    public Double getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(Double childPrice) {
        this.childPrice = childPrice;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
