package com.newroad.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.newroad.manage.entity.TaxSource1;
import com.newroad.util.QueryCriteria;

public interface TaxSource1Mapper {
    int insert(TaxSource1 record);
    /**
     * 添加数据的方法
     * @param record TaxSource1对象
     * @return 受影响行数
     */
    int insertSelective(TaxSource1 record);

    TaxSource1 selectByPrimaryKey(Integer id);
    /**
     * 分页的方法
     * @param offset 偏移量
     * @param rows 页数
     * @param qc 条件表达式
     * @return 分页后的list集合
     */
    List<TaxSource1> listByPage(@Param("offset")Integer offset,@Param("rows")Integer rows,@Param("qc")QueryCriteria qc);
    /**
     * 计算总数的方法
     * @param qc 条件表达式
     * @return 总记录数(double) 计算分页时需要向上取整
     */
    int getCount(@Param("qc")QueryCriteria qc);
    /**
     * 添加图片的方法
     * @return 受影响的行数
     */
    int addImg(@Param("value")Object[] value);
    /**
             * 删除一条记录的方法
     * @param id 条件
     * @return 影响行数
     */
    int remove(Integer id);
}