package com.glen.SpringCore2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
	@Autowired
	Laptop laptop;
	
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
    	context.scan("com.glen");
    	context.refresh();
    	Laptop laptop= (Laptop) context.getBean("laptop");
    	laptop.getLaptopDetails();
    }
    
}
