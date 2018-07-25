package com.oocl.restfulparkingcompany.service;

import com.oocl.restfulparkingcompany.dao.ICarDao;
import com.oocl.restfulparkingcompany.dao.IOrderDao;
import com.oocl.restfulparkingcompany.dao.IReceiptDao;
import com.oocl.restfulparkingcompany.domain.Car;
import com.oocl.restfulparkingcompany.domain.Order;
import com.oocl.restfulparkingcompany.domain.Receipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiptService implements IReceiptService{
    @Autowired
    IReceiptDao receiptDao;

    @Autowired
    ICarDao carDao;

    @Autowired
    IOrderDao orderDao;

    @Override
    public Receipt addReceipt(Receipt receipt) {
        return receiptDao.addReceipt(receipt);
    }

    @Override
    public Receipt parkCar(Car car) {
        Car returnCar = carDao.addCar(car);
        orderDao.addOrder(new Order());
        return receiptDao.parkCar(returnCar);
    }

    @Override
    public Car getCarByReceiptId(String receiptId) {
        return receiptDao.getCarByReceiptId(receiptId);
    }

    @Override
    public Car unParkCar(String receiptId) {
        return receiptDao.unParkCar(receiptId);
    }
}
