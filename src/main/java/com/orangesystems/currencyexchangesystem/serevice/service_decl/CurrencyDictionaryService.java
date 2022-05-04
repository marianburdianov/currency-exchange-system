package com.orangesystems.currencyexchangesystem.serevice.service_decl;

import com.orangesystems.currencyexchangesystem.entity.CurrencyDictionary;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CurrencyDictionaryService {
    Flux<CurrencyDictionary> getAllCurrencyDictionary();

    Mono<CurrencyDictionary> createCurrency(CurrencyDictionary currencyDictionary);

    Mono<CurrencyDictionary> updateCurrencyById(CurrencyDictionary currencyDictionary, Long currencyDictionaryId);

    Mono<Void> deleteCurrencyById(Long currencyDictionaryId);
}
