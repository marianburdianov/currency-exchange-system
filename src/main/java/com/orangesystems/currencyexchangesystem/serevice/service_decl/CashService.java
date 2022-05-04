package com.orangesystems.currencyexchangesystem.serevice.service_decl;

import com.orangesystems.currencyexchangesystem.entity.Cash;
import reactor.core.publisher.Flux;

public interface CashService {
    Flux<Cash> getAllCash();
}
