package com.oocl.restfulparkingcompany;

import com.oocl.restfulparkingcompany.domain.*;

import java.util.*;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
public class DB {
	private static Map<Integer, ParkingBoy> parkingBoyMap = new LinkedHashMap<>();
	private static Map<Integer, ParkingLot> parkingLotMap = new LinkedHashMap<>();
	private static Map<String, Order> orderMap = new LinkedHashMap<>();
	private static Map<String, Receipt> receiptMap = new LinkedHashMap<>();
	private static Map<Integer, Car> carMap = new LinkedHashMap<>();
	private static Map<String,Integer> relationshipFromCarToReceiptMap = new LinkedHashMap<>();
	private static int parkingBoyIdGenerator = 1;
	private static int parkingLotIdGenerator = 1;
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
		String uuid = UUID.randomUUID().toString();
		order.setOrderId(uuid);
		orderMap.put(uuid, order);
		return order;
	}

	public static List<Order> getAllOrders(){
		return new LinkedList<>(orderMap.values());
	}

	public static boolean updateOrderUsable(String orderId, boolean usable){
		try {
			Order order = orderMap.get(orderId);
			order.setUsable(usable);
			orderMap.put(orderId, order);
			return true;
		}catch (Exception e){
			return false;
		}
	}

	public static Receipt addReceipt(Receipt receipt){
		String uuid = UUID.randomUUID().toString();
		receipt.setReceiptId(uuid);
		receiptMap.put(uuid, receipt);
		return receipt;
	}

	public static Receipt getReceiptById(String receiptId){
		return receiptMap.get(receiptId);
	}

	public static Car getCarByReceiptId(String receiptId) {
		int carId = relationshipFromCarToReceiptMap.get(receiptId);
		try {
			return carMap.get(carId);
		}catch (Exception e){
			return null;
		}
	}
}
