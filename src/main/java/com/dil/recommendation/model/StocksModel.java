package com.dil.recommendation.model;

public class StocksModel {
	String stockName;
	Long expectedPrice;
	String expectedDate;
	String recommendationDate;
	String status;
	Long percentage;
	String progress;
	
	
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
	public String getExpectedDate() {
		return expectedDate;
	}
	public void setExpectedDate(String expectedDate) {
		this.expectedDate = expectedDate;
	}
	public String getRecommendationDate() {
		return recommendationDate;
	}
	public void setRecommendationDate(String recommendationDate) {
		this.recommendationDate = recommendationDate;
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
