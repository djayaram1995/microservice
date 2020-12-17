package com.currency.limit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.currency.limit.configuration.Configuration;
import com.currency.limit.model.LimitConfig;

@RestController
public class LimitController {

	@Autowired
	private Configuration config;
	
	@GetMapping("limits")
	public LimitConfig retrieveLimit() {
		return new LimitConfig(config.getMax(), config.getMin());
	}
}
