package com.orangesystems.currencyexchangesystem.controller;

import com.orangesystems.currencyexchangesystem.entity.CurrencyDictionary;
import com.orangesystems.currencyexchangesystem.serevice.service_decl.CurrencyDictionaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
public class CurrencyDictionaryController {
    private final CurrencyDictionaryService currencyDictionaryService;

    @GetMapping("/currencyDictionary")
    public Flux<CurrencyDictionary> getAll() {
        return currencyDictionaryService.getAllCurrencyDictionary();
    }

    @PostMapping("/currencyDictionary")
    public Mono<CurrencyDictionary> createCurrency(@RequestBody CurrencyDictionary currency) {
        return currencyDictionaryService.createCurrency(currency);
    }

    @PutMapping("/currencyDictionary/{currencyDictionaryId}")
    Mono<CurrencyDictionary> updateCurrency(@RequestBody CurrencyDictionary currency
            , @PathVariable Long currencyDictionaryId) {
        return currencyDictionaryService.updateCurrencyById(currency, currencyDictionaryId);
    }

    @DeleteMapping("/currencyDictionary/{currencyDictionaryId}")
    Mono<Void> deleteCurrency(@PathVariable Long currencyDictionaryId) {
        return currencyDictionaryService.deleteCurrencyById(currencyDictionaryId);
    }
}
