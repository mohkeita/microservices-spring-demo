package io.mohkeita.customerservice.service;

import io.mohkeita.customerservice.model.Account;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface AccountService {

    List<Account> findByCutomer(@PathVariable("customer") Integer customer);
}
