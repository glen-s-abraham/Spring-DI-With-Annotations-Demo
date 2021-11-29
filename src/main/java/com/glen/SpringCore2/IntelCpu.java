package com.glen.SpringCore2;

import org.springframework.stereotype.Component;

@Component
public class IntelCpu implements CPU{
	
	private int core;
	private String brand;
	public int getCore() {
		return core;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public IntelCpu() {

		this.core = 4;
		this.brand = "Intel";
	}
	
	

}
