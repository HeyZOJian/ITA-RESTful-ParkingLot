package com.oocl.restfulparkingcompany.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.oocl.restfulparkingcompany.domain.ParkingLot;
import com.oocl.restfulparkingcompany.service.IParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Vito Zhuang on 7/25/2018.
 */
@RestController
public class ParkingLotController {
	@Autowired
	IParkingLotService parkingLotService;

	@GetMapping("/parkingLots")
	public List<ParkingLot> getAllParkingLots(){
		return parkingLotService.getAllParkingLots();
	}

	@GetMapping("/parkingLots/{parkingLotId}")
	public ParkingLot getParkingLotById(@PathVariable int parkingLotId){
		return parkingLotService.getParkingLotById(parkingLotId);
	}

	@PostMapping("/parkingLots")
	public JSONObject addParkingLot(@RequestBody ParkingLot parkingLot){
		JSONObject res = new JSONObject();
		ParkingLot newParkingLot = parkingLotService.addParkingLot(parkingLot);
		if(newParkingLot!=null){
			res.put("message","add parkingLot successfully");
			res.put("parkingLot",newParkingLot);
		}
		else{
			res.put("message","add parkingLot failed");
		}
		return res;
	}
}
