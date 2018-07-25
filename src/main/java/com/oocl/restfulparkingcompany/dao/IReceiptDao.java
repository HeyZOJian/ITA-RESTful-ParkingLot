package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.domain.Car;
import com.oocl.restfulparkingcompany.domain.Receipt;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public interface IReceiptDao {
	Receipt addReceipt(Receipt receipt);
	Car getCarByReceiptId(String receiptId);
}
