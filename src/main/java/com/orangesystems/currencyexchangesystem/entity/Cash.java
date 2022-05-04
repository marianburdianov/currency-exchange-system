package com.orangesystems.currencyexchangesystem.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Table("cash")
public class Cash {
    @Id
    private Long cashId;
    private Long employeeId;
    private Long currencyDictionaryId;
    private Integer amount;
    private LocalDate date;
}
