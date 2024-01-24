package com.dil.recommendation.service;

import java.text.ParseException;
import java.util.List;

import com.dil.recommendation.entity.Stocks;
import com.dil.recommendation.model.StocksModel;

public interface StockService {

	List<Stocks> getAllStockDetails();

	List<Stocks> getStockByName(String stockName);

	List<Stocks> getStockByStatus(String status);

	StocksModel uploadAllData(StocksModel stockdata) throws ParseException;

}
