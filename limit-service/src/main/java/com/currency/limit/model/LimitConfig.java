package com.currency.limit.model;

public class LimitConfig {
	
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

	public LimitConfig(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

	public LimitConfig() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LimitConfig [max=").append(max).append(", min=").append(min).append("]");
		return builder.toString();
	}
	

}
