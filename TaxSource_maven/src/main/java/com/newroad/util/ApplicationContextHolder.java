package com.newroad.util;

import org.springframework.beans.BeansException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
/**
 * 将该类纳入IOC容器，当IOC容器启动，自动调用setApplicationContext方法为这个类设置ApplicationContext对象
 * @author Administrator
 *
 */
@Component
public class ApplicationContextHolder implements ApplicationContextAware {
	private static ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		ApplicationContextHolder.context=context;
		
	}
	/**
	 * 根据指定class从IOC容器获得指定对象
	 * @param <T>
	 * @param cls
	 * @return
	 */
	public static <T>T getBean(Class<T> cls){
		return context.getBean(cls);
	}
}
