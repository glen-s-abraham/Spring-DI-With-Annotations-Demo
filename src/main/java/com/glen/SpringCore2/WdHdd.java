package com.glen.SpringCore2;

import org.springframework.stereotype.Component;

@Component
public class WdHdd implements Hdd{
	
	private int size;
	private String brand;
	public int getSize() {
		return size;
	}
	public String getBrand() {
		return brand;
	}
	public WdHdd() {
		this.brand="Western Digital";
		this.size=500;
	}
	
	
}
