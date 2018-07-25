package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.domain.ParkingLot;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public interface IParkingLotDao {
	boolean addParkingLot(ParkingLot parkingLot);
	ParkingLot getParkingLotById(int id);
}
