package com.liuxch.test;

import org.apache.log4j.Logger;

/***
 * Log4j简单使用示例
 * @author landingbj
 *
 */
public class TestLogger4j {
	
	private static Logger logger = Logger.getLogger(TestLogger4j.class);

	public static void main(String[] args) {
		       logger.debug("this is debug message");
	}

}
