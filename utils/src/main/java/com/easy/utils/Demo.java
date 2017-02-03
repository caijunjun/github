package com.easy.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
	private static final Logger logger=LoggerFactory.getLogger(Demo.class);
	
	public static void print(){
		System.out.println("hello world");
		Demo.class.getResource("/");
		logger.info(Demo.class.getResource("/").toString());
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		
	}
}
