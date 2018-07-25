package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.DB;
import com.oocl.restfulparkingcompany.domain.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderDao implements IOrderDao{
    @Override
    public Order addOrder(Order order) {
        return DB.addOrder(order);
    }

    @Override
    public List<Order> getAllUsableOrder() {
        return DB.getAllUsableOrder();
    }

    @Override
    public Order updateOrderStatus(String uuid, int parkingBoyId) {
        return DB.updateOrderStatus(uuid, parkingBoyId);
    }
}
