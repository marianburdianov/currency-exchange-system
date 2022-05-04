package com.orangesystems.currencyexchangesystem.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@Table("currency_dictionary")
public class CurrencyDictionary {
    @Id
    private Long currencyDictionaryId;
    private String code;
}
