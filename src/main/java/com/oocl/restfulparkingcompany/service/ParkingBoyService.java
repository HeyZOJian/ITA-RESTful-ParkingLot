package com.oocl.restfulparkingcompany.service;

import com.oocl.restfulparkingcompany.dao.IParkingBoyDao;
import com.oocl.restfulparkingcompany.domain.ParkingBoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
@Service
public class ParkingBoyService implements IParkingBoyService {
	@Autowired
	IParkingBoyDao parkingBoyDao;

	@Override
	public List<ParkingBoy> getAllParkingBoys() {
		return parkingBoyDao.getAllParkingBoys();
	}

	@Override
	public ParkingBoy addParkingBoy(ParkingBoy parkingBoy) {
		return parkingBoyDao.addParkingBoy(parkingBoy);
	}

	@Override
	public ParkingBoy getParkingBoyById(int id) {
		return parkingBoyDao.getParkingBoyById(id);
	}

	@Override
	public boolean addParkingLotInParkingBoy(int parkingBoyId, int parkingLotId) {
		return parkingBoyDao.addParkingLotInParkingBoy(parkingBoyId,parkingLotId);
	}
}
