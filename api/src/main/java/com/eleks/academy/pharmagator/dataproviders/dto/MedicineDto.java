package com.eleks.academy.pharmagator.dataproviders.dto;

import com.eleks.academy.pharmagator.entities.Medicine;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.text.ParseException;

@Data
@Builder
public class MedicineDto {
    private String title;
    private BigDecimal price;
    private String externalId;

}
