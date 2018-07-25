package com.oocl.restfulparkingcompany;

import com.oocl.restfulparkingcompany.domain.*;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public class DB {
	private static Map<Integer, ParkingBoy> parkingBoyMap = new LinkedHashMap<>();
	private static Map<Integer, ParkingLot> parkingLotMap = new LinkedHashMap<>();
	private static Map<Integer, Order> orderMap = new LinkedHashMap<>();
	private static Map<Integer, Receipt> receiptMap = new LinkedHashMap<>();
	private static Map<Integer, Car> carMap = new LinkedHashMap<>();
	private static Map<Integer,Integer> relationshipFromCarToReceiptMap = new LinkedHashMap<>();
	private static int parkingBoyIdGenerator = 1;
	private static int parkingLotIdGenerator = 1;
	private static int orderIdGenerator = 1;
	private static int receiptIdGenerator = 1;
	private static int carIdGenerator = 1;

	public static ParkingBoy addParkingBoy(ParkingBoy parkingBoy){
		try {
			parkingBoy.setId(parkingBoyIdGenerator);
			parkingBoyMap.put(parkingBoyIdGenerator++, parkingBoy);
			return parkingBoy;
		}catch (Exception e){
			return null;
		}
	}

	public static ParkingLot addParkingLot(ParkingLot parkingLot){
		try {
			parkingLot.setId(parkingLotIdGenerator);
			parkingLotMap.put(parkingLotIdGenerator++, parkingLot);
			return parkingLot;
		}catch (Exception e){
			return null;
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
			ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
			parkingBoy.getParkingLots().add(parkingLotId);
			parkingLot.setParkingBoy(parkingBoy.getId());
			parkingBoyMap.put(parkingBoyId, parkingBoy);
			return true;
		}catch (Exception e){
			return false;
		}
	}

	public static List<ParkingBoy> getAllParkingBoys() {
		return new LinkedList<>(parkingBoyMap.values());
	}

	public static List<ParkingLot> getAllParkingLots(){
		return new LinkedList<>(parkingLotMap.values());
	}

	public static Order addOrder(Order order){
		try{
			order.setOrderId(orderIdGenerator);
			orderMap.put(orderIdGenerator++, order);
			return order;
		}catch (Exception e){
			return null;
		}
	}

	public List<Order> getAllOrders(){
		return new LinkedList<>(orderMap.values());
	}

	public boolean updateOrderUsable(int orderId, boolean usable){
		try {
			Order order = orderMap.get(orderId);
			order.setUsable(usable);
			orderMap.put(orderId, order);
			return true;
		}catch (Exception e){
			return false;
		}
	}
}
