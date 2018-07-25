package com.oocl.restfulparkingcompany.service;

import com.oocl.restfulparkingcompany.domain.ParkingBoy;

import java.util.List;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public interface IParkingBoyService {
	List<ParkingBoy> getAllParkingBoys();
	boolean addParkingBoy(ParkingBoy parkingBoy);
	ParkingBoy getParkingBoyById(int id);
	boolean addParkingLotInParkingBoy(int parkingBoyId, int parkingLotId);
}
