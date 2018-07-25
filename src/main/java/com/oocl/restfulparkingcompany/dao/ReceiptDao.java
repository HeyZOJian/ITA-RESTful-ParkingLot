package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.DB;
import com.oocl.restfulparkingcompany.domain.Car;
import com.oocl.restfulparkingcompany.domain.Receipt;
import org.springframework.stereotype.Component;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
@Component
public class ReceiptDao implements IReceiptDao {
	@Override
	public Receipt addReceipt(Receipt receipt) {
		return DB.addReceipt(receipt);
	}

	@Override
	public Car getCarByReceiptId(String receiptId) {
		return DB.getCarByReceiptId(receiptId);
	}
}
