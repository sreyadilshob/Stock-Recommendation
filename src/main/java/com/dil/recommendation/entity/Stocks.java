package com.dil.recommendation.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stocks {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String stockName;
	Long expectedPrice;
	Date expectedDate;
	Date recommendationDate;
    Date currDate;
	String status;
	Long percentage;
	String progress;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Long getExpectedPrice() {
		return expectedPrice;
	}
	public void setExpectedPrice(Long expectedPrice) {
		this.expectedPrice = expectedPrice;
	}
	public Date getExpectedDate() {
		return expectedDate;
	}
	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}
	public Date getRecommendationDate() {
		return recommendationDate;
	}
	public void setRecommendationDate(Date recommendationDate) {
		this.recommendationDate = recommendationDate;
	}
	public Date getCurrDate() {
		return currDate;
	}
	public void setCurrDate(Date currDate) {
		this.currDate = currDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getPercentage() {
		return percentage;
	}
	public void setPercentage(Long percentage) {
		this.percentage = percentage;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	
	

}
