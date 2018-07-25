package com.oocl.restfulparkingcompany.controller;

import com.alibaba.fastjson.JSONObject;
import com.oocl.restfulparkingcompany.domain.Order;
import com.oocl.restfulparkingcompany.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    IOrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllUsableOrder(){
        return orderService.getAllUsableOrder();
    }

    @PutMapping("/orders/{orderId}")
    public JSONObject rapOrder(@PathVariable String orderId, @RequestBody JSONObject request){
        JSONObject res = new JSONObject();
        Order order = orderService.updateOrderStatus(orderId, (Integer) request.get("parkingBoyId"));
        if(order!=null){
            res.put("order",order);
            res.put("message","rap order successfully");
        }else{
            res.put("message","rap order failed");
        }
        return res;
    }
}
