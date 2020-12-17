package com.currency.converter.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.currency.converter.client.CurrencyExchangeFeign;
import com.currency.converter.model.CurrencyConverter;

@RestController
public class CurrencyConverterController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyConverterController.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	private CurrencyExchangeFeign currFeignClient;
	
	@GetMapping("currency-convert/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConverter getExchangeRate(@PathVariable String from, @PathVariable String to, @PathVariable int quantity) {
		RestTemplate rest = new RestTemplate();
		Map<String, String> map = new HashMap<>();
		map.put("from", from);
		map.put("to", to);
		ResponseEntity<CurrencyConverter> response = rest.getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConverter.class, map);
		CurrencyConverter cc = response.getBody();
		cc.setQuantity(BigDecimal.valueOf(quantity));
		cc.setConvertedValue(cc.getQuantity().multiply(cc.getExchangeRate()));
		//cc.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		LOGGER.info("Resp : "+cc);
		return cc;
	}
	
	@GetMapping("currency-convert-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConverter getFeignExchangeRate(@PathVariable String from, @PathVariable String to, @PathVariable int quantity) {
		CurrencyConverter cc = currFeignClient.getExchangeRate(from, to);
		cc.setQuantity(BigDecimal.valueOf(quantity));
		cc.setConvertedValue(cc.getQuantity().multiply(cc.getExchangeRate()));
		//cc.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		LOGGER.info("Resp : "+cc);
		return cc;
	}

}
