package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.domain.ParkingLot;

import java.util.List;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public interface IParkingLotDao {
	ParkingLot addParkingLot(ParkingLot parkingLot);
	ParkingLot getParkingLotById(int id);
	List<ParkingLot> getAllParkingLots();
}
