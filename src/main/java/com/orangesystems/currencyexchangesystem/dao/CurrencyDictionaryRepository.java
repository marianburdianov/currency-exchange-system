package com.orangesystems.currencyexchangesystem.dao;

import com.orangesystems.currencyexchangesystem.entity.CurrencyDictionary;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyDictionaryRepository extends ReactiveCrudRepository<CurrencyDictionary, Long> {
}
