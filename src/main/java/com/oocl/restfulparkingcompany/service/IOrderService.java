package com.oocl.restfulparkingcompany.service;

import com.oocl.restfulparkingcompany.domain.Order;

import java.util.List;

public interface IOrderService {
    Order addOrder(Order order);
    List<Order> getAllOrder();
    boolean updateOrderUsble(String uuid, boolean usble);
}
