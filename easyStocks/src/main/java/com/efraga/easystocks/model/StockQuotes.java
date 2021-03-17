package com.efraga.easystocks.model;

import java.util.Date;

public class StockQuotes extends Stocks{
	private double price;
	private Date data;
	
	public StockQuotes() {
		
	}

	public StockQuotes(int id, String stockName, String stockSymbol, double price, Date data) {
		super(id, stockName, stockSymbol);
		this.price = price;
		this.data = data;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	

}
