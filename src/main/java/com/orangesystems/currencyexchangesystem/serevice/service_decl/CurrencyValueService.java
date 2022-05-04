package com.orangesystems.currencyexchangesystem.serevice.service_decl;

import com.orangesystems.currencyexchangesystem.entity.CurrencyValue;
import reactor.core.publisher.Flux;

public interface CurrencyValueService {
    Flux<CurrencyValue> getAllCurrencyValue();
}
