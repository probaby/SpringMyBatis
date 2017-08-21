package com.hb.dao.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hb.service.BaseService;

public class SpringMybatisTest {
	private ApplicationContext applicationContext;
	

	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		// 创建UserDao的对象
		BaseService userDao = (BaseService)applicationContext.getBean("baseService");

		// 调用UserDao的方法
		userDao.getStringList();
		
	}
}
