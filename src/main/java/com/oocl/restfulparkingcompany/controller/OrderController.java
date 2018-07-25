package com.oocl.restfulparkingcompany.controller;

import com.oocl.restfulparkingcompany.domain.Order;
import com.oocl.restfulparkingcompany.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    IOrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrder(){
        return orderService.getAllOrder();
    }
}
