package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.domain.ParkingBoy;
import com.oocl.restfulparkingcompany.domain.ParkingLot;

import java.util.List;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public interface IParkingBoyDao {
	List<ParkingBoy> getAllParkingBoys();
	boolean addParkingBoy(ParkingBoy parkingBoy);
	ParkingBoy getParkingBoyById(int id);
	boolean addParkingLotInParkingBoy(int parkingBoyId, int parkingLotId);
}
