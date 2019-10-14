package com.fps.springjbehave.model;

import java.util.List;

public class Store {

	private String storeId;
	
	private String name;
	
	private String description;
	
	private List<String> imageUrls;
	
	private String placeId;
	
	private String floorNo;
	
	private String storePos;

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}

	public String getStorePos() {
		return storePos;
	}

	public void setStorePos(String storePos) {
		this.storePos = storePos;
	}
	
	
}
