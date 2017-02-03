package com.easy.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Demo {
	private static final Logger logger=LoggerFactory.getLogger(Demo.class);
	public static void main(String[] args) {
		com.easy.utils.Demo.print();
		logger.info(Demo.class.getResource("/config.properties").toString());
	}
}
