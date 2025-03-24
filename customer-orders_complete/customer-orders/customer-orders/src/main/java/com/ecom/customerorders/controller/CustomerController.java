package com.ecom.customerorders.controller;



import com.ecom.customerorders.model.Customer;
import com.ecom.customerorders.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;


@RestController
@Tag(name = "Customer API", description = "operations related to customers")
@RequestMapping("/customers")

public class CustomerController {

    @Autowired
    private CustomerService service;
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.addCustomer(customer);
    }
    @GetMapping
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }
    @GetMapping("/id")
    public Customer getCustomerById(@PathVariable Long id) {
        return service.getCustomerById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        service.deleteCustomer(id);
    }
}
