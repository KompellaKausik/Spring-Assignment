package com.Restaurant.App.Controller;

import com.Restaurant.App.Entity.Orders;
import com.Restaurant.App.Repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class OrderController {

    private OrdersRepository ordersRepository;

    @Autowired
    public OrderController(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @GetMapping("/orders")
    public List<Orders> findAll(){
        return ordersRepository.findAll();
    }
}
