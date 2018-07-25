package com.oocl.restfulparkingcompany.domain;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public class Car {
	private String uuid;
	private String plateNum;

	public Car() {
	}

	public Car(String uuid,String plateNum) {
		this.uuid = uuid;
		this.plateNum = plateNum;
	}

	public String getPlateNum() {
		return plateNum;
	}

	public void setPlateNum(String plateNum) {
		this.plateNum = plateNum;
	}

	public void setId(String id) {
		this.uuid = id;
	}

    public String getUUID() {
        return this.uuid;
	}
}
