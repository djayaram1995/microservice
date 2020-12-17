package com.currency.converter.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.currency.converter.model.CurrencyConverter;


//@FeignClient(name = "currency-exchange", url = "localhost:8000")
@FeignClient(name = "zuul-apigateway")
@RibbonClient(name = "currency-exchange")
public interface CurrencyExchangeFeign {

	
	@GetMapping("currency-exchange/currency-exchange/from/{from}/to/{to}")
	public CurrencyConverter getExchangeRate(@PathVariable String from, @PathVariable String to);
}
