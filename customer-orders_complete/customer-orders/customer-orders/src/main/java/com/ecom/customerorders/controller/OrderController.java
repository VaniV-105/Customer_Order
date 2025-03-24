package com.ecom.customerorders.controller;


import com.ecom.customerorders.model.Order;
import com.ecom.customerorders.service.OrderService;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Order API", description = "operations related to orders")
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return service.addOrder(order);
    }
    @GetMapping
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }
    @GetMapping("/id")
    public Order getOrderById(@PathVariable Long id) {
        return service.getOrderById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        service.deleteOrder(id);
    }
}

