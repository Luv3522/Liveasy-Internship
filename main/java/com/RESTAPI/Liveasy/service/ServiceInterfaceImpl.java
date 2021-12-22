package com.RESTAPI.Liveasy.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.RESTAPI.Liveasy.Dao.DaoClass;
import com.RESTAPI.Liveasy.entities.PayLoad;

@Service
public class ServiceInterfaceImpl implements ServiceInterface {
	@Autowired
	private DaoClass daoclass;
	ArrayList<PayLoad> list=new ArrayList<>();
	
	
	
	@Override
	public PayLoad addload(PayLoad load) {
		//list.add(load);
			daoclass.save(load);
			return load;
	}



	@Override
	public ArrayList<PayLoad> getload() {
		
		return (ArrayList<PayLoad>) daoclass.findAll();
	}



	@Override
	public void updateload(PayLoad l1) {
		
//		for (PayLoad load : list) {
//			if (l1.getShipperId().equalsIgnoreCase(load.getShipperId())) {
//				load.setLoadingPoint(l1.getLoadingPoint());
//				load.setUnloadingPoint(l1.getUnloadingPoint());
//				load.setProductType(l1.getProductType());
//				load.setTruckType(l1.getTruckType());
//				load.setComment(l1.getComment());
//				load.setWeight(l1.getWeight());
//				load.setDate(l1.getDate());
//				}
//		}
		this.daoclass.save(l1);
	}



	@Override
	public ResponseEntity<HttpStatus> deleteload(String Id) {
		// TODO Auto-generated method stub
//		for (PayLoad load:list) {
//			if (load.getShipperId().equalsIgnoreCase(Id)) {
//				list.remove(load);
//			}
//		}
		try {
			this.daoclass.deleteById(Id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}



	
	@Override
	public ArrayList<PayLoad> getload(Iterable<String> loadId) {
//		
//		ArrayList<PayLoad> list1=new ArrayList<>();
//		for (PayLoad l1:list) {
//			if(l1.getShipperId().equalsIgnoreCase(loadId)) {
//				list1.add(l1);
//			}
//		}
		return (ArrayList<PayLoad>) daoclass.findAllById(loadId);
	}




	

}
