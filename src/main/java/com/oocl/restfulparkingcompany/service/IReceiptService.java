package com.oocl.restfulparkingcompany.service;

import com.oocl.restfulparkingcompany.domain.Car;
import com.oocl.restfulparkingcompany.domain.Receipt;

public interface IReceiptService {
    Receipt addReceipt(Receipt receipt);
    Car getCarByReceiptId(String receiptId);
}
