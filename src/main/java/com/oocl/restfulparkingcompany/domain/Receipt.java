package com.oocl.restfulparkingcompany.domain;

import java.util.UUID;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public class Receipt {
	private String receiptId;
	private boolean usable;

	public Receipt() {
		this.usable = true;
	}

	public Receipt(String receiptId) {
		this.receiptId = receiptId;
		this.usable = true;
	}

	public String getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}
}
