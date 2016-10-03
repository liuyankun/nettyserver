package com.hxat.anxin.nettyserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class NettyServerBootstrap {
	public static void main(String[] args) {
		final Logger logger = LoggerFactory.getLogger(NettyServerBootstrap.class);
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "xmlconfig/applicationContext-mybatis.xml", "xmlconfig/applicationContext-spring.xml" });
		logger.info("spring 加载完毕！");
	}
}
