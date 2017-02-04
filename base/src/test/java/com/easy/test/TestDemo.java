package com.easy.test;

import java.io.IOException;
import java.util.Properties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestDemo {

	private static final Logger logger = LoggerFactory.getLogger(TestDemo.class);

	@Test
	public void test() {
		Properties properties = new Properties();
		try {
			ClassPathResource resource = new ClassPathResource("/config.properties", TestDemo.class);
			properties=PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info(properties.getProperty("config"));
	}
}
