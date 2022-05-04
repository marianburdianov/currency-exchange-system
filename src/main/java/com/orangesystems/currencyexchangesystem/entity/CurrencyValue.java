package com.orangesystems.currencyexchangesystem.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Table("currency_value")
public class CurrencyValue {
    @Id
    private Long currencyValueId;
    private Long currencyDictionaryId;
    private Integer rate;
    private Double value;
    private LocalDate date;
}
