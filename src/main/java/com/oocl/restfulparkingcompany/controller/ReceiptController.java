package com.oocl.restfulparkingcompany.controller;

import com.alibaba.fastjson.JSONObject;
import com.oocl.restfulparkingcompany.domain.Car;
import com.oocl.restfulparkingcompany.service.IReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiptController {
    @Autowired
    IReceiptService receiptService;

    @PutMapping("/receipt")
    public JSONObject parking(@RequestBody Car car){
        receiptService.
    }
}
