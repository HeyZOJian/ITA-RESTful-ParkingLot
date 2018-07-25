package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.domain.Order;
import org.springframework.stereotype.Component;

import java.util.List;


public interface IOrderDao {
    Order addOrder(Order order);
    List<Order> getAllOrder();
    boolean updateOrderUsble(String uuid, boolean usble);
}
