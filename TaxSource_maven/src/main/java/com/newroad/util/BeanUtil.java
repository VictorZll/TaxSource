package com.newroad.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.newroad.exception.BeanConverteExcpetion;

public class BeanUtil {
	
	public static <T> T mapToBean(T t,Map<String,? extends Object> map){
		try {
			BeanUtils.populate(t, map);
			return t;
		} catch(Exception e){
			throw new BeanConverteExcpetion(t.getClass()+"转换出现异常",e);
		}
	}
	/**
	 * 将javabean对象分解为两个list集合，第一个list集合中存放属性名，第二个list集合中存放属性值 并将这两个list存储到一个list集合中进行返回
	 * @param obj 被分解的对象
	 * @return
	 */
	public static List<List<String>> decomposeBean(Object obj){
		
		List<List<String>> list = new ArrayList<>();
		List<String> keys = new ArrayList<>();
		List<String> values = new ArrayList<>();
		Class<?> cls = obj.getClass();
		Field[] fields = cls.getDeclaredFields();
		for(Field field :fields) {
			String fname = field.getName();
			String methodName = "get"+Character.toUpperCase(fname.charAt(0))+fname.substring(1);
			try {
				Method method = cls.getDeclaredMethod(methodName);
				Object value = method.invoke(obj);
				if(value != null) {
					keys.add(fname);
					values.add(value.toString());
				}
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		list.add(keys);
		list.add(values);
		return list;
	}


}
