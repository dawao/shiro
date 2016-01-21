package com.shiro.job;

import com.shiro.util.SpringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestScheduleJob {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	public void main(String url){
		logger.info("任务执行中...");
		logger.info("http client get..."+url);
		logger.info("SpringUtils.getBean return : " + SpringUtils.getBean("scheduler"));
	}
	
}
