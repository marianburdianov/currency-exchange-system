package com.orangesystems.currencyexchangesystem.serevice.service_impl;

import com.orangesystems.currencyexchangesystem.dao.CurrencyValueRepository;
import com.orangesystems.currencyexchangesystem.entity.CurrencyValue;
import com.orangesystems.currencyexchangesystem.serevice.service_decl.CurrencyValueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Service
public class CurrencyValueServiceImpl implements CurrencyValueService {
    private final CurrencyValueRepository currencyValueRepository;

    @Override
    public Flux<CurrencyValue> getAllCurrencyValue() {
        return currencyValueRepository.findAll();
    }
}
