package com.fps.springjbehave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fps.springjbehave.model.Store;
import com.fps.springjbehave.service.StoreService;

@RestController
@RequestMapping("/api/stores")
public class StoreController {

	@Autowired
	StoreService storeService;
	
	
	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<Store> getStores() {
		
		return storeService.getStores();
	}
	
	
	/**
	 * 
	 * @param storeId
	 * @return
	 */
	@GetMapping("/{storeId}")
	public Store getStore(@PathVariable("storeId") String storeId) {
		
		return storeService.getStore(storeId);
	}
}
