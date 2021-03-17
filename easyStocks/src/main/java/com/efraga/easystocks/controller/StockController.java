package com.efraga.easystocks.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efraga.easystocks.model.Stocks;

@RestController
@RequestMapping("/stocks")
public class StockController {
	
	@GetMapping
	public List<Stocks> listar() {
		List<Stocks>stocksList = new ArrayList();
		Stocks stocks =  new Stocks();
		stocks.setId(1);
		stocks.setStockName("Petrobrás");
		stocks.setStockSymbol("PETR4.SA");
		stocksList.add(stocks);
		return stocksList;
	}
}
