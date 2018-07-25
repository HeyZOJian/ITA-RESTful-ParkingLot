package com.oocl.restfulparkingcompany.service;

import com.oocl.restfulparkingcompany.domain.ParkingBoy;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public interface IParkingBoyService {
	boolean addParkingBoy(ParkingBoy parkingBoy);
	ParkingBoy getParkingBoyById(int id);
	boolean addParkingLotInParkingBoy(int parkingBoyId, int parkingLotId);
}
