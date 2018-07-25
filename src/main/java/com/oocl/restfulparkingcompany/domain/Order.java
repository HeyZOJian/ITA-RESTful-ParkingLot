package com.oocl.restfulparkingcompany.domain;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public class Order {
	private String orderId;
	private int parkingBoyID;
	private boolean beHeld;

	public Order(){
		this.parkingBoyID = 0;
		this.beHeld = false;
	}

	public Order(String orderId, int parkingBoyID) {
		this.orderId = orderId;
		this.parkingBoyID = parkingBoyID;
		this.beHeld = false;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getParkingBoyID() {
		return parkingBoyID;
	}

	public void setParkingBoyID(int parkingBoyID) {
		this.parkingBoyID = parkingBoyID;
	}

	public boolean isBeHeld() {
		return beHeld;
	}

	public void setBeHeld(boolean beHeld) {
		this.beHeld = beHeld;
	}
}
