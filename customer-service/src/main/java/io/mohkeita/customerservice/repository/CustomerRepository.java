package io.mohkeita.customerservice.repository;

import io.mohkeita.customerservice.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Customer findByCustomerId(Integer customerId);
}
