package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.domain.Order;

import java.util.List;


public interface IOrderDao {
    Order addOrder(Order order);
    List<Order> getAllUsableOrder();
    Order updateOrderStatus(String uuid, int parkingBoyId);
}
