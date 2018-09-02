package com.wangerhu.jcutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: TestLog4j
 * @Description: TODO:测试log日志是否配置完成
 * @Author: Wang-ErHu -- > wt631017192@qq.com
 * @Date: 2018年9月1日 下午4:06:50
 * @Vesion: 版本号:
 */
public class TestLog4j {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestLog4j.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 记录debug级别的信息
		LOGGER.debug("This is debug message.");
		// 记录info级别的信息
		LOGGER.info("This is info message.");
		// 记录error级别的信息
		LOGGER.error("This is error message.");
	}

}
