package com.satish.CoreJavaThirdAssignment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	final Logger l1 = LoggerFactory.getLogger(Logger_SingleTon.class);
    	System.out.println("&&&&&&&");
    	final Logger ll1 = LoggerFactory.getLogger(Logger_SingleTon.class);
    	System.out.println("******");
    	Logger logger=Logger_SingleTon.getInstance();
    	logger.info("inside main Method");
        System.out.println( "Hello World!" );
        
        SampleExample ex=new SampleExample();
    }
}
