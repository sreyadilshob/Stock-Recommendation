package com.dil.recommendation.service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dil.recommendation.entity.Stocks;
import com.dil.recommendation.model.StocksModel;
import com.dil.recommendation.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService{
    @Autowired
	StockRepository stockRepo;	

	@Override
	public StocksModel uploadAllData(StocksModel stockModel) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println("expectedDate is "+stockModel.getExpectedDate());
		Stocks stock = new Stocks();
		stock.setStockName(stockModel.getStockName());
		stock.setExpectedPrice(stockModel.getExpectedPrice());
		stock.setExpectedDate(dateFormat.parse(stockModel.getExpectedDate()+" 00:00:00"));
		stock.setRecommendationDate(dateFormat.parse(stockModel.getRecommendationDate()+" 00:00:00"));
		stock.setStatus(stockModel.getStatus());
		stock.setCurrDate(new Date());
		stock.setPercentage(stockModel.getPercentage());
		stock.setProgress(stockModel.getProgress());
		stockRepo.save(stock);
		return stockModel;
		
	}

	@Override
	public List<Stocks> getAllStockDetails() {
		
		return stockRepo.findAll();
	}

	@Override
	public List<Stocks> getStockByName(String stockName) {
		
		return stockRepo.findByStockName(stockName);
	}

	@Override
	public List<Stocks> getStockByStatus(String status) {
		return stockRepo.findByStatus(status);
	}

}
