package com.oocl.restfulparkingcompany.service;

import com.oocl.restfulparkingcompany.dao.IOrderDao;
import com.oocl.restfulparkingcompany.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService{
    @Autowired
    IOrderDao orderDao;

    @Override
    public Order addOrder(Order order) {
        return orderDao.addOrder(order);
    }

    @Override
    public List<Order> getAllUsableOrder() {
        return orderDao.getAllUsableOrder();
    }

    @Override
    public Order updateOrderStatus(String uuid, int parkingBoyId) {
        return orderDao.updateOrderStatus(uuid, parkingBoyId);
    }
}
