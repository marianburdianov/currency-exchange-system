package com.orangesystems.currencyexchangesystem.dao;

import com.orangesystems.currencyexchangesystem.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Long> {
}
