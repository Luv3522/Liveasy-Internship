package com.RESTAPI.Liveasy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PayLoad {
	
	@Id
	private String shipperId;   
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private String weight;
	private String comment;
	private String Date;
	public PayLoad(String loadingPoint, String unloadingPoint, String productType, String truckType, String weight,
			String comment, String shipperId, String Date) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.Date = Date;
	}
	public PayLoad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
}
