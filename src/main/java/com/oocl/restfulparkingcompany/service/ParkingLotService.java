package com.oocl.restfulparkingcompany.service;

import com.oocl.restfulparkingcompany.DB;
import com.oocl.restfulparkingcompany.dao.IParkingLotDao;
import com.oocl.restfulparkingcompany.domain.ParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
@Service
public class ParkingLotService implements IParkingLotService {

	@Autowired
	IParkingLotDao parkingLotDao;

	@Override
	public ParkingLot addParkingLot(ParkingLot parkingLot) {
		return parkingLotDao.addParkingLot(parkingLot);
	}

	@Override
	public ParkingLot getParkingLotById(int id) {
		return parkingLotDao.getParkingLotById(id);
	}

	@Override
	public List<ParkingLot> getAllParkingLots() {
		return parkingLotDao.getAllParkingLots();
	}
}
