package io.mohkeita.customerservice.controller;

import io.mohkeita.customerservice.model.Account;
import io.mohkeita.customerservice.model.Customer;
import io.mohkeita.customerservice.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value = "/customer")
    public Customer save(@RequestBody Customer customer){
        logger.info("Saving Customer information "+customer);
        return customerRepository.save(customer);
    }

    @GetMapping(value = "/customer")
    public Iterable<Customer> all(){
        List<Customer> customers = new ArrayList<>();
        for(Customer customer : customerRepository.findAll()){
            //logger.info("All Customers information "+accountService.findByCutomer(customer.getCustomerId()));
            //	customer.setAccount(accountService.findByCutomer(customer.getCustomerId()));
        }
        return customers;
    }

    @GetMapping(value = "/customer/{customerId}")
    public Customer findByAccountId(@PathVariable Integer customerId){
        Customer customer = customerRepository.findByCustomerId(customerId);
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        logger.info("Customer's account information by calling account-service ");
        List<Account> list = restTemplate.getForObject("http://localhost:6060/account/customer/"+customerId, List.class, customer);
        //String hii = restTemplate.getForObject("http://localhost:6161/hi", String.class,params);
        customer.setAccount(list);
        logger.info("Find Customer information by id with fetched account info: ");
        return customer;
    }

    @PutMapping(value = "/customer")
    public Customer update(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @DeleteMapping(value = "/customer")
    public void delete(@RequestBody Customer customer){
        customerRepository.delete(customer);
    }
}
