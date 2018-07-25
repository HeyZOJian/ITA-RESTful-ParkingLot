package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.domain.Car;
import com.oocl.restfulparkingcompany.domain.Receipt;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public interface IReceiptDao {
	Receipt addReceipt(Receipt receipt);
	Receipt parkCar(Car car);
	Car getCarByReceiptId(String receiptId);

    Car unParkCar(String receiptId);
}
