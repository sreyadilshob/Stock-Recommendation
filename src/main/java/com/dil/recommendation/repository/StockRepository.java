package com.dil.recommendation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dil.recommendation.entity.Stocks;

public interface StockRepository extends JpaRepository<Stocks, Long> {
	List<Stocks> findByStockName(String stockName);

	List<Stocks> findByStatus(String status);

}
