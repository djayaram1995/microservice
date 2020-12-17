package com.currency.exchange.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.exchange.dao.CurrencyExchangeRepository;
import com.currency.exchange.model.CurrencyExchange;

@RestController
public class CurrencyExchangeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyExchangeController.class);
	
	@Autowired
	private CurrencyExchangeRepository currencyDao;
	
	@Autowired
	private Environment env;
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange getExchangeRate(@PathVariable String from, @PathVariable String to) {
		CurrencyExchange currExchange = currencyDao.findByCurrencyFromAndCurrencyTo(from, to);
		currExchange.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		LOGGER.info("Resp : "+currExchange);
		return currExchange;
	}

}
