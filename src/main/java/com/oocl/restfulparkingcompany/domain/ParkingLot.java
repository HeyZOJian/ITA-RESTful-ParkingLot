package com.oocl.restfulparkingcompany.domain;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public class ParkingLot {
	private int id;
	private String name;
	private int size;
	private int remain;
	private ParkingBoy parkingBoy;

	public ParkingLot() {
	}

	public ParkingLot(int id, String name, int size, int remain, ParkingBoy parkingBoy) {
		this.id = id;
		this.name = name;
		this.size = size;
		this.remain = remain;
		this.parkingBoy = parkingBoy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}

	public ParkingBoy getParkingBoy() {
		return parkingBoy;
	}

	public void setParkingBoy(ParkingBoy parkingBoy) {
		this.parkingBoy = parkingBoy;
	}
}
