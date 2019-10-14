package com.fps.springjbehave.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fps.springjbehave.model.Store;

/**
 * 
 * @author fsoljon
 *
 */
public interface StoreMapper {

	List<Store> selectStores();
	
	Store selectStore(@Param("storeId") String storeId);

}
