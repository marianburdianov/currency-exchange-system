package com.orangesystems.currencyexchangesystem.serevice.service_impl;

import com.orangesystems.currencyexchangesystem.dao.EmployeeRepository;
import com.orangesystems.currencyexchangesystem.entity.Employee;
import com.orangesystems.currencyexchangesystem.serevice.service_decl.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Flux<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Mono<Employee> createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
