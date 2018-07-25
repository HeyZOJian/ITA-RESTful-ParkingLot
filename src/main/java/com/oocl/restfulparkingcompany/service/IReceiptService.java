package com.oocl.restfulparkingcompany.service;

import com.oocl.restfulparkingcompany.domain.Car;
import com.oocl.restfulparkingcompany.domain.Receipt;

public interface IReceiptService {
    Receipt addReceipt(Receipt receipt);
    Receipt parkCar(Car car);
    Car getCarByReceiptId(String receiptId);
    Car unParkCar(String receiptId);
}
