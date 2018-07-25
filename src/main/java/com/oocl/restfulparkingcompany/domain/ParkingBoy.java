package com.oocl.restfulparkingcompany.domain;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public class ParkingBoy {
	private int id;
	private String name;
	private int age;
	private String gender;
	private List<ParkingLot> parkingLots = new LinkedList<>();

	public ParkingBoy() {
	}

	public ParkingBoy(int id, String name, int age, String gender, List<ParkingLot> parkingLots) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.parkingLots = parkingLots;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<ParkingLot> getParkingLots() {
		return parkingLots;
	}

	public void setParkingLots(List<ParkingLot> parkingLots) {
		this.parkingLots = parkingLots;
	}
}

