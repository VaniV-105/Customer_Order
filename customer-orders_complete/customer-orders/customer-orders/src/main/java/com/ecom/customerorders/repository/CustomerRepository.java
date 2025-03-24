package com.ecom.customerorders.repository;


import com.ecom.customerorders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { }

