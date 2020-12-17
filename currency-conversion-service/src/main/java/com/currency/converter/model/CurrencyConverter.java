package com.currency.converter.model;

import java.math.BigDecimal;

public class CurrencyConverter {
	
	private int id;
	
	private String currencyFrom;
	
	private String currencyTo;
	
	private BigDecimal exchangeRate;
	
	private BigDecimal quantity;
	
	private BigDecimal convertedValue;
	
	private int port;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getConvertedValue() {
		return convertedValue;
	}

	public void setConvertedValue(BigDecimal convertedValue) {
		this.convertedValue = convertedValue;
	}

	public CurrencyConverter() {
		
	}

	public CurrencyConverter(int id, String currencyFrom, String currencyTo, BigDecimal exchangeRate,
			BigDecimal quantity, BigDecimal convertedValue, int port) {
		super();
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.exchangeRate = exchangeRate;
		this.quantity = quantity;
		this.convertedValue = convertedValue;
		this.port = port;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CurrencyExchange [id=").append(id).append(", currencyFrom=").append(currencyFrom)
				.append(", currencyTo=").append(currencyTo).append(", exchangeRate=").append(exchangeRate)
				.append(", port=").append(port).append("]");
		return builder.toString();
	}
	
}
