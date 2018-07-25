package com.oocl.restfulparkingcompany.domain;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public class Order {
	private String orderId;
	private boolean usable;

	public Order() {
		this.usable = true;
	}

	public Order(String orderId) {
		this.orderId = orderId;
		this.usable = true;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public boolean isUsable() {
		return usable;
	}

	public void setUsable(boolean usable) {
		this.usable = usable;
	}
}
