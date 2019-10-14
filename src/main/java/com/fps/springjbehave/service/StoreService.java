package com.fps.springjbehave.service;

import java.util.List;

import com.fps.springjbehave.model.Store;

/**
 * 
 * @author fsoljon
 *
 */
public interface StoreService {

	
	/**
	 * 
	 * @return
	 */
	List<Store> getStores();
	
	
	/**
	 * 
	 * @param storeId
	 * @return
	 */
	Store getStore(String storeId);
	
}
