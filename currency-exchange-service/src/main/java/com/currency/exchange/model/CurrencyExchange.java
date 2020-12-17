package com.currency.exchange.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class CurrencyExchange {
	@Id
	private int id;
	
	private String currencyFrom;
	
	private String currencyTo;
	
	private BigDecimal exchangeRate;
	
	@Transient
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

	public CurrencyExchange(String currencyFrom, String currencyTo, BigDecimal exchangeRate) {
		super();
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.exchangeRate = exchangeRate;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public CurrencyExchange() {
		
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
