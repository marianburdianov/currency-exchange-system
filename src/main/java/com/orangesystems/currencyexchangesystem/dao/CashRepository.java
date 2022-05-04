package com.orangesystems.currencyexchangesystem.dao;

import com.orangesystems.currencyexchangesystem.entity.Cash;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashRepository extends ReactiveCrudRepository<Cash, Long> {
}
