package com.ecom.customerorders.repository;


import com.ecom.customerorders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
