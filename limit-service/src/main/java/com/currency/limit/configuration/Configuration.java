package com.currency.limit.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")
public class Configuration {
	
	private int max;
	
	private int min;

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public Configuration(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

	public Configuration() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LimitConfig [max=").append(max).append(", min=").append(min).append("]");
		return builder.toString();
	}
	

}
