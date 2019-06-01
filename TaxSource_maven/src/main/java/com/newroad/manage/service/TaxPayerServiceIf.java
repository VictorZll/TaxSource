package com.newroad.manage.service;

import java.io.Serializable;
import java.util.List;

import com.newroad.manage.entity.TaxPayer;

public interface TaxPayerServiceIf extends Serializable {
	/**
	 *  分页查询所有数据
	 * @param pageStr
	 * @param rowsStr
	 * @param payerCode
	 * @param payerName
	 * @return
	 */
	List<TaxPayer> listByPage(String pageStr,String rowsStr,String payerCode,String payerName);
	/**
	 * 查询总记录数
	 * @param payerCode
	 * @param payerName
	 * @return
	 */
	int getCount(String payerCode ,String payerName);
	/**
	 * 查询单条记录
	 * @param taxpayerCode
	 * @return
	 */
	TaxPayer getSingleData(String payerCode);
	/**
	 * 添加一条记录
	 * @param values 传的是对象
	 * @return true 则表示添加成功
	 */
	boolean add(TaxPayer taxPayer);
	/**
	 * 删除的方法
	 * @param payerCode
	 * @return
	 */
	boolean remove(String payerCode);
	/**
	 * 验证唯一性的方法
	 * @param payerCode
	 * @return
	 */
	boolean isRepeat(String payerCode);
	/**
	 * 修改数据的方法
	 * @param taxpayer
	 * @return
	 */
	boolean update(TaxPayer taxpayer,String payerCode);
}
