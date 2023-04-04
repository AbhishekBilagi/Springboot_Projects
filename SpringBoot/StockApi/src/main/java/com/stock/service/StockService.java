package com.stock.service;

import java.util.List;

import com.stock.model.StockAPI;

public interface StockService {
	
	public StockAPI save(StockAPI stock);
	
	public List<StockAPI> findAll();

}
