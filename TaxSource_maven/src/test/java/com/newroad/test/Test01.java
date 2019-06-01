package com.newroad.test;



import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newroad.system.entity.User;
import com.newroad.system.service.UserServiceIf;
import com.newroad.system.service.imp.UserServiceImp;

public class Test01 {
	static ApplicationContext context;
	static UserServiceIf service;
	@BeforeClass
	public static void init() {
		 context=new ClassPathXmlApplicationContext("applicationContext.xml");
		 service=context.getBean(UserServiceIf.class);
	}
	@Test
	public void testUser() {
		System.out.println(service);
		User u=service.login("zhangsan", "594f803b380a41396ed63dca39503542");
		System.out.println(u);
	}

}
