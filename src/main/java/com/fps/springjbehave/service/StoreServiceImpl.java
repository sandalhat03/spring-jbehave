package com.fps.springjbehave.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fps.springjbehave.dao.StoreMapper;
import com.fps.springjbehave.model.Store;

/**
 * 
 * @author fsoljon
 *
 */
@Service
@Transactional
public class StoreServiceImpl implements StoreService {

	
	private final StoreMapper storeMapper;
	
	 
	/**
	 * 
	 * @param storeMapper StoreMapper autowired
	 */
	public StoreServiceImpl(StoreMapper storeMapper) {
		this.storeMapper = storeMapper;
	}
	
	
	@Override
	public List<Store> getStores() {
		
		return storeMapper.selectStores();
	}

	
	@Override
	public Store getStore(String storeId) {
		
		return storeMapper.selectStore(storeId);
	}

}
