package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.domain.ParkingBoy;
import com.oocl.restfulparkingcompany.domain.ParkingLot;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public interface IParkingBoyDao {
	boolean addParkingBoy(ParkingBoy parkingBoy);
	ParkingBoy getParkingBoyById(int id);
	boolean addParkingLotInParkingBoy(int parkingBoyId, int parkingLotId);
}
