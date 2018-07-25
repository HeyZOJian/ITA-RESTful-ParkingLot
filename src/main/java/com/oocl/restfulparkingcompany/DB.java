package com.oocl.restfulparkingcompany;

import com.oocl.restfulparkingcompany.domain.ParkingBoy;
import com.oocl.restfulparkingcompany.domain.ParkingLot;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public class DB {
	private static Map<Integer, ParkingBoy> parkingBoyMap = new LinkedHashMap<>();
	private static Map<Integer, ParkingLot> parkingLotMap = new LinkedHashMap<>();
	private static int parkingBoyIdGenerator = 1;
	private static int parkingLotIdGenerator = 1;

	public static boolean addParkingBoy(ParkingBoy parkingBoy){
		try {
			parkingBoy.setId(parkingBoyIdGenerator);
			parkingBoyMap.put(parkingBoyIdGenerator++, parkingBoy);
			return true;
		}catch (Exception e){
			return false;
		}
	}

	public static boolean addParkingLot(ParkingLot parkingLot){
		try {
			parkingLot.setId(parkingLotIdGenerator);
			parkingLotMap.put(parkingLotIdGenerator++, parkingLot);
			return true;
		}catch (Exception e){
			return false;
		}
	}

	public static ParkingBoy getParkingBoyById(int id){
		return parkingBoyMap.get(id);
	}

	public static ParkingLot getParkingLotById(int id){
		return parkingLotMap.get(id);
	}

	public static boolean addParkingLotInParkingBoy(int parkingBoyId, int parkingLotId){
		try {
			ParkingBoy parkingBoy = parkingBoyMap.get(parkingBoyId);
			parkingBoy.getParkingLots().add(parkingLotId);
			parkingBoyMap.put(parkingBoyId, parkingBoy);
			return true;
		}catch (Exception e){
			return false;
		}
	}
}
