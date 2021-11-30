package com.javastart.bill.dto;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class BillRequestDTO {
    private Long accountId;

    private BigDecimal amount;

    private Boolean isDefault;

    private Boolean overdraftEnabled;
}
