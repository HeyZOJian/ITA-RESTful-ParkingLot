package com.oocl.restfulparkingcompany.domain;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public class Receipt {
	private int receiptId;
	private boolean usable;

	public Receipt() {
		this.usable = true;
	}

	public Receipt(int receiptId) {
		this.receiptId = receiptId;
		this.usable = true;
	}

	public int getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(int receiptId) {
		this.receiptId = receiptId;
	}
}
