package com.orangesystems.currencyexchangesystem.dao;

import com.orangesystems.currencyexchangesystem.entity.CurrencyValue;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyValueRepository extends ReactiveCrudRepository<CurrencyValue, Long> {
}
