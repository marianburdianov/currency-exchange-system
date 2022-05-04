package com.orangesystems.currencyexchangesystem.serevice.service_impl;

import com.orangesystems.currencyexchangesystem.dao.CashRepository;
import com.orangesystems.currencyexchangesystem.entity.Cash;
import com.orangesystems.currencyexchangesystem.serevice.service_decl.CashService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Service
public class CashServiceImpl implements CashService {
    private final CashRepository cashRepository;

    @Override
    public Flux<Cash> getAllCash() {
        return cashRepository.findAll();
    }
}
