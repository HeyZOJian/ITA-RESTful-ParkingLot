package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.DB;
import com.oocl.restfulparkingcompany.domain.ParkingBoy;
import org.springframework.stereotype.Component;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
@Component
public class ParkingBoyDao implements IParkingBoyDao {
	@Override
	public boolean addParkingBoy(ParkingBoy parkingBoy) {
		return DB.addParkingBoy(parkingBoy);
	}

	@Override
	public ParkingBoy getParkingBoyById(int id) {
		return DB.getParkingBoyById(id);
	}

	@Override
	public boolean addParkingLotInParkingBoy(int parkingBoyId, int parkingLotId) {
		return DB.addParkingLotInParkingBoy(parkingBoyId,parkingLotId);
	}
}
