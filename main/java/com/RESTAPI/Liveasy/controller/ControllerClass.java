package com.RESTAPI.Liveasy.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RESTAPI.Liveasy.entities.PayLoad;
import com.RESTAPI.Liveasy.service.ServiceInterface;

@RestController
public class ControllerClass {
	@Autowired
	private ServiceInterface service;
	
	//adding load info to the database and displaying added load's information
	@PostMapping("/load")
	public PayLoad addload(@RequestBody PayLoad load) {
		System.out.println("load details added successfully.");
		return this.service.addload(load);
	}
	
	//displaying/getting load's information from database
	@GetMapping("/load")
	public ArrayList<PayLoad> getload(){
		return this.service.getload();
	}
	
	//getting information of particular load using shipperId from database
	@GetMapping("/load/{loadId}")
	public ArrayList<PayLoad> getload(@PathVariable Iterable<String> loadId){
		System.out.println("loads with shipperId: "+loadId);
		return this.service.getload(loadId);
	}
	
	//updating existing load's information using shipperId from database
	@PutMapping("/load/{loadId}")
	public void updateload(@RequestBody PayLoad l1) {
		this.service.updateload(l1);
	}
	
	//deleting load's information using shipperId from database
	@DeleteMapping("load/{loadId}")
	public void deleteload(@PathVariable String loadId) {
		
			this.service.deleteload(loadId);
		
	}
}
