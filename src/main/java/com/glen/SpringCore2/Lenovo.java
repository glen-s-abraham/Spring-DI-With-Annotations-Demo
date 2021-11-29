package com.glen.SpringCore2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("laptop")
public class Lenovo implements Laptop{
	
	@Autowired
	Hdd hdd;
	CPU cpu;
	
	public Lenovo(Hdd hdd, CPU cpu) {
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	public void getLaptopDetails() {
		System.out.println("Lenovo");
		System.out.println("CPU: "+cpu.getBrand()+" Size: "+cpu.getCore());
		System.out.println("Harddisk: "+hdd.getBrand()+" Size: "+hdd.getSize());
	}

}
