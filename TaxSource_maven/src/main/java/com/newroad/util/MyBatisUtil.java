package com.newroad.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	
	private static SqlSessionFactory factory ;
	static {
		InputStream in = MyBatisUtil.class.getResourceAsStream("/mybatis_config.xml");
		//创建SqlSessionFactoryBuilder对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//获取factory对象
		factory = builder.build(in);
	}
	
	public static SqlSession getSession() {
		return factory.openSession();
	}
	
	public static void closeSession(SqlSession session) {
		if(session != null) {
			session.commit();
			session.close();
		}
	}

}
