package com.newroad.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.newroad.manage.entity.TaxSource;
import com.newroad.util.QueryCriteria;

public interface TaxSourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaxSource record);

    int insertSelective(TaxSource record);


    int updateByPrimaryKeySelective(TaxSource record);

    int updateByPrimaryKey(TaxSource record);
    TaxSource selectByPrimaryKey(Integer id);
    /**
     * 分页的方法
     * @param offset 偏移量
     * @param rows 页数
     * @param qc 条件表达式
     * @return 分页后的list集合
     */
    List<TaxSource> listByPage(@Param("offset")Integer offset,@Param("rows")Integer rows,@Param("qc")QueryCriteria qc);
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