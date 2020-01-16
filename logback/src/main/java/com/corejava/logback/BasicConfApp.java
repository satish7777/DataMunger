package com.corejava.logback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicConfApp {
    final static Logger logger = LoggerFactory.getLogger(BasicConfApp.class);
    
    public static void main(String[] args) {
        logger.info("Msg #1 - info");
        logger.warn("Msg #2 - warn");
        logger.error("Msg #3 - error ");
        logger.debug("Msg #4 - debug");


}
}