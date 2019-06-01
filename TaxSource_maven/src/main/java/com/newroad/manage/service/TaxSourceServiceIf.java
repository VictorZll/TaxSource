package com.newroad.manage.service;

import java.util.List;

import com.newroad.manage.entity.TaxSource;

public interface TaxSourceServiceIf {
	/**
	 * 添加数据的方法
	 * @param TaxSource
	 * @return
	 */
	boolean addTaxSource(TaxSource t);
	/**
	 * 分页的方法
	 * @param pageStr
	 * @param rowsStr
	 * @return
	 */
	List<TaxSource> listByPage(String pageStr,String rowsStr,String[] conditions);
	/**
	 * 获得总数的方法
	 * @return
	 */
	double getCount(String[] conditions);
	/**
	 * 将一组图片信息添加到表里
	 * @param url,info->value
	 * @return
	 */
	boolean addImg(Object[] values);
	/**
	 * 删除一条记录的方法
	 * @return
	 */
	boolean remove(String idStr);
	/**
	 * 回填数据的方法
	 * @return
	 */
	TaxSource getTaxSourceById(String id);
}
