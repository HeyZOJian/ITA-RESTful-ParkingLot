package com.oocl.restfulparkingcompany.controller;

import com.oocl.restfulparkingcompany.domain.Car;
import com.oocl.restfulparkingcompany.domain.Receipt;
import com.oocl.restfulparkingcompany.service.IReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReceiptController {
    @Autowired
    IReceiptService receiptService;

    @PutMapping("/receipt")
    public Receipt parkCar(@RequestBody Car car){
        Receipt receipt = receiptService.parkCar(car);
        return receipt;
    }

    @GetMapping("/receipt/{receiptId}")
    public Car unParkCar(@PathVariable String receiptId){
        return receiptService.unParkCar(receiptId);
    }
}
