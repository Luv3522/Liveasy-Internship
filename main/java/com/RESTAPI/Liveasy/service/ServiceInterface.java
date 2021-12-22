package com.RESTAPI.Liveasy.service;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.RESTAPI.Liveasy.entities.PayLoad;

@Service
public interface ServiceInterface {

	public PayLoad addload(PayLoad load);

	public ArrayList<PayLoad> getload();

	public void updateload(PayLoad l1);

	public ResponseEntity<HttpStatus> deleteload(String loadId);

	public ArrayList<PayLoad> getload(Iterable<String> loadId);
	
}
