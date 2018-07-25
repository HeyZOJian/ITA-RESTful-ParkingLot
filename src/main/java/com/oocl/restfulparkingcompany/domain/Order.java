package com.oocl.restfulparkingcompany.domain;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public class Order {
	private int orderId;
	private boolean usable;

	public Order() {
		this.usable = true;
	}

	public Order(int orderId) {
		this.orderId = orderId;
		this.usable = true;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public boolean isUsable() {
		return usable;
	}

	public void setUsable(boolean usable) {
		this.usable = usable;
	}
}
