package com.fps.springjbehave.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;

import com.fps.springjbehave.Steps;
import com.fps.springjbehave.model.Store;

@Steps
public class StoreServiceImplSteps {
	
	String storeId;
	
	Store storeRetrieved;
	
	@Autowired
	StoreService storeService;
	
	
	@Given("store ID is $storeId")
	public void setStoreId(String storeId) {

		this.storeId = storeId;
	}
	
	
	@When("store is retrieved")
	public void retrieveStoreById() {
		
		this.storeRetrieved = this.storeService.getStore(this.storeId);
	}
	
	
	@Then("store details are '$name', '$description', '$placeId', '$floorNo' and '$storePos'")
	public void assertStoreDetails(String name, 
			String description, 
			String placeId,
			String floorNo,
			String storePos) {
		
		assertThat("Store name", this.storeRetrieved.getName(), equalTo(name));
		assertThat("Store description", this.storeRetrieved.getDescription(), equalTo(description));
		assertThat("Store place ID", this.storeRetrieved.getPlaceId(), equalTo(placeId));
		assertThat("Store floor number", this.storeRetrieved.getFloorNo(), equalTo(floorNo));
		assertThat("Store position", this.storeRetrieved.getStorePos(), equalTo(storePos));
	}

}
