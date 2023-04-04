package com.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.model.StockAPI;
import com.stock.service.StockService;

@RestController
@RequestMapping("/api")
public class StockController {
	
	@Autowired
	private StockService service;
	
	@PostMapping("/stock")
	public StockAPI save(@RequestBody StockAPI stock) {
		return service.save(stock);
		
	}
	
	@GetMapping("/stocks")
	public List<StockAPI> findAll() {
		return service.findAll();
		
	}

}
