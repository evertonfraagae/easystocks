package com.efraga.easystocks.model;

import java.util.ArrayList;
import java.util.List;

public class Stocks {
	private int id;
	private String stockName;
	private String stockSymbol;
	private List<StockQuotes> quotes = new ArrayList();
	
	public Stocks() {
		String teste = " ";
	}

	public Stocks(int id,String stockName, String stockSymbol) {
		this.id=id;
		this.stockName = stockName;
		this.stockSymbol = stockSymbol;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public List<StockQuotes> getQuotes() {
		return quotes;
	}
	
	
}
