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
    public List<Order> getAllOrder() {
        return DB.getAllOrders();
    }

    @Override
    public boolean updateOrderUsble(String uuid, boolean usble) {
        return DB.updateOrderUsable(uuid, usble);
    }
}
