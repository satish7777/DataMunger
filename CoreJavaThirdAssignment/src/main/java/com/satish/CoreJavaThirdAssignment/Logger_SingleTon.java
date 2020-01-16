package com.satish.CoreJavaThirdAssignment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logger_SingleTon {
	private static Logger instance=null;
	
	private Logger_SingleTon(){
		
	}

	public static Logger getInstance() {
		if(instance==null) {
			
			System.out.println("satish");
			instance= LoggerFactory.getLogger(Logger_SingleTon.class);
		}
		return  instance;
	}
}


