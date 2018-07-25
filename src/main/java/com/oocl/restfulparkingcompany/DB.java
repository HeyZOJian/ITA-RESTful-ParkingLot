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

	public static void addParkingBoy(ParkingBoy parkingBoy){
		parkingBoyMap.put(parkingBoyIdGenerator++, parkingBoy);
	}

	public static void addParkingLot(ParkingLot parkingLot){
		parkingLotMap.put(parkingLotIdGenerator++, parkingLot);
	}

	public static ParkingBoy getParkingBoyById(int id){
		return parkingBoyMap.get(id);
	}

	public static ParkingLot getParkingLotById(int id){
		return parkingLotMap.get(id);
	}
}
