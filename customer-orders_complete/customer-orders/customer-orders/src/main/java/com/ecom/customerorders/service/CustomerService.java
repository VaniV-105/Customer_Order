package com.ecom.customerorders.service;
import com.ecom.customerorders.exception.ResourceNotFoundException;
import com.ecom.customerorders.model.Customer;
import com.ecom.customerorders.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }
    public Customer getCustomerById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found"));
    }
    public Customer addCustomer(Customer customer) {
        return repository.save(customer);
    }
    public void deleteCustomer(Long id) {
        repository.deleteById(id);
    }


}
