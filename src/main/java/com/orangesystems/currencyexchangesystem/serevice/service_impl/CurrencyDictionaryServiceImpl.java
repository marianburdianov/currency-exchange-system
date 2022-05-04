package com.orangesystems.currencyexchangesystem.serevice.service_impl;

import com.orangesystems.currencyexchangesystem.dao.CurrencyDictionaryRepository;
import com.orangesystems.currencyexchangesystem.entity.CurrencyDictionary;
import com.orangesystems.currencyexchangesystem.serevice.service_decl.CurrencyDictionaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class CurrencyDictionaryServiceImpl implements CurrencyDictionaryService {
    private final CurrencyDictionaryRepository currencyDictionaryRepository;

    @Override
    public Flux<CurrencyDictionary> getAllCurrencyDictionary() {
        return currencyDictionaryRepository.findAll();
    }

    @Override
    public Mono<CurrencyDictionary> createCurrency(CurrencyDictionary currencyDictionary) {
        return currencyDictionaryRepository.save(currencyDictionary);
    }

    @Override
    public Mono<CurrencyDictionary> updateCurrencyById(CurrencyDictionary currency, Long currencyId) {
        return currencyDictionaryRepository.findById(currencyId)
                .map(c -> {
                    c.setCode(currency.getCode());
                    return c;
                }).flatMap(currencyDictionaryRepository::save);
    }

    @Override
    public Mono<Void> deleteCurrencyById(Long currencyDictionaryId) {
        return currencyDictionaryRepository.deleteById(currencyDictionaryId);
    }

}
