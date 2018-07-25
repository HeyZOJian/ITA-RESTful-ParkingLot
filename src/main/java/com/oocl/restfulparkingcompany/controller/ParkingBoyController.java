package com.oocl.restfulparkingcompany.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.oocl.restfulparkingcompany.domain.ParkingBoy;
import com.oocl.restfulparkingcompany.domain.ParkingLot;
import com.oocl.restfulparkingcompany.service.IParkingBoyService;
import com.oocl.restfulparkingcompany.service.IParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
@RestController
public class ParkingBoyController {

	@Autowired
	IParkingBoyService parkingBoyService;

	@Autowired
	IParkingLotService parkingLotService;

	@PostMapping("/parkingBoys")
	public JSONObject addParkingBoy(@RequestBody ParkingBoy parkingBoy){
		JSONObject res = new JSONObject();
		ParkingBoy newParkingBoy = parkingBoyService.addParkingBoy(parkingBoy);
		if(newParkingBoy!=null) {
			res.put("message", "add parkingBoy successfully");
			res.put("parkingBoy",newParkingBoy);
		}
		else {
			res.put("message", "add parkingBoy failed");
		}
		return res;
	}

	@GetMapping("/parkingBoys")
	public List<JSONObject> getAllParkingBoys(){
		JSONObject res = new JSONObject();
		List<ParkingBoy> unFormatedParkingBoys = parkingBoyService.getAllParkingBoys();
		List<JSONObject> formatedParkingBoys = new LinkedList<>();
		for (ParkingBoy parkingBoy: unFormatedParkingBoys){
			formatedParkingBoys.add(formatParkingBoys(parkingBoy));
		}
		return formatedParkingBoys;
	}

	@GetMapping("/parkingBoys/{parkingBoyId}")
	public ParkingBoy getParkingBoyById(@PathVariable int parkingBoyId){
		return parkingBoyService.getParkingBoyById(parkingBoyId);
	}

	@PutMapping("/parkingBoys/{parkingBoyId}")
	public JSONObject addParkingLotInParkingBoy(@PathVariable int parkingBoyId
			,@RequestBody JSONObject request){
		JSONObject res = new JSONObject();
		if(parkingBoyService.addParkingLotInParkingBoy(parkingBoyId,
				(Integer) request.get("parkingLotId"))){
			res.put("message","add parkingLot in parkingBoy successfully");
		}
		else{
			res.put("message","add parkingLot in parkingBoy failed");
		}
		return res;
	}

	private JSONObject formatParkingBoys(ParkingBoy unFormatedparkingBoy){
		JSONObject formatedParkingBoy = new JSONObject();
		formatedParkingBoy.put("id",unFormatedparkingBoy.getId());
		formatedParkingBoy.put("name", unFormatedparkingBoy.getName());
		formatedParkingBoy.put("age",unFormatedparkingBoy.getAge());
		formatedParkingBoy.put("gender",unFormatedparkingBoy.getGender());
		List<ParkingLot> parkingLots = new LinkedList<>();
		for(int parkingLotId : unFormatedparkingBoy.getParkingLots()){
			ParkingLot parkingLot = parkingLotService.getParkingLotById(parkingLotId);
			parkingLots.add(parkingLot);
		}
		formatedParkingBoy.put("parkingLots", parkingLots);
		return formatedParkingBoy;
	}

}
