package com.dil.recommendation.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dil.recommendation.entity.Stocks;
import com.dil.recommendation.model.StocksModel;
import com.dil.recommendation.service.StockService;

@RestController
@RequestMapping("/stock")
public class RecommendationController {
	@Autowired
	StockService stockService;
	
	@GetMapping("/stocks")
	List<Stocks> getAllStockDetials(){
		return stockService.getAllStockDetails();
	}
	
	@GetMapping("/{stockName}")
	List<Stocks> getStockbyStockName(@PathVariable String stockName){
		return stockService.getStockByName(stockName);
	}
	
	@GetMapping("/stocks/{status}")
	List<Stocks> getStockbyStatus(@PathVariable String status){
		return stockService.getStockByStatus(status);
	}
	
	@PostMapping("/data")
	StocksModel uploadStocksdata(@RequestBody StocksModel stockdata) throws ParseException{		
		return stockService.uploadAllData(stockdata);
	}

}
