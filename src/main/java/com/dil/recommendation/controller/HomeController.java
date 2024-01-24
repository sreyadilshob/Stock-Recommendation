package com.dil.recommendation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dil.recommendation.entity.Stocks;
import com.dil.recommendation.service.StockService;

@Controller
public class HomeController {
	
	@Autowired
	StockService stockService;
	
	@GetMapping("/")
	public String home(Model model) {
		
		List<Stocks> stocks = stockService.getAllStockDetails();
		model.addAttribute("stocks", stocks);
		
		return "home";
	}

}
