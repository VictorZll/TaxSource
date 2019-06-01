package com.newroad.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.newroad.manage.entity.TaxPayer1;
import com.newroad.util.QueryCriteria;

public interface TaxPayer1Mapper {

    int insert(TaxPayer1 record);
	/**
	 * 添加方法
	 * @param record
	 * @return
	 */
    int insertSelective(TaxPayer1 record);

    TaxPayer1 selectByPrimaryKey(Integer id);
    /**
     * 1分页的方法
     */
    List<TaxPayer1> listByPage(@Param("offset")Integer offset,@Param("rows")Integer rows,@Param("qc")QueryCriteria qc);
    /**
     * 2计算总数的方法
     * @param qc
     * @return
     */
    int getCount(@Param("qc")QueryCriteria qc);
    /**
     * 3查询单条数据的方法
     * @return
     */
    TaxPayer1 querySingleData(@Param("payerCode")String payerCode);
    /**
     * 4添加数据的方法
     * @return
     */
    //Boolean add(@Param("taxPayer")TaxPayer1 taxPayer);
    /**
     * 5删除数据的方法
     * @return
     */
    int remove(String payerCode);
    /**
     * 6验证是否重复的方法
     * @param payerCode
     * @return 对象
     */
    TaxPayer1 isRepeat(Integer payerCode);
    /**
     * 7修改的方法
     * @param taxpayer
     * @param payerCode
     * @return
     */
    int updateByTaxpayerCode(TaxPayer1 taxpayer);
}