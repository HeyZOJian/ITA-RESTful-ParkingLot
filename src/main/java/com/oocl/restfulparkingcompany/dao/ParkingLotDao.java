package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.DB;
import com.oocl.restfulparkingcompany.domain.ParkingLot;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
@Component
public class ParkingLotDao implements IParkingLotDao {
	@Override
	public ParkingLot addParkingLot(ParkingLot parkingLot) {
		return DB.addParkingLot(parkingLot);
	}

	@Override
	public ParkingLot getParkingLotById(int id) {
		return DB.getParkingLotById(id);
	}

	@Override
	public List<ParkingLot> getAllParkingLots() {
		return DB.getAllParkingLots();
	}
}
