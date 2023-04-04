package com.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.stock.model.StockAPI;
import com.stock.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository repo;
	@Override
	public StockAPI save(StockAPI stock) {
		
		return repo.save(stock);
	}

	@Override
	public List<StockAPI> findAll() {
		
		return repo.findAll();
	}

}
