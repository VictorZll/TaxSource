package com.newroad.manage.dao;

import java.util.List;

import com.newroad.manage.entity.TaxOrgan1;

public interface TaxOrgan1Mapper {
    int insert(TaxOrgan1 record);

    int insertSelective(TaxOrgan1 record);

    TaxOrgan1 selectByPrimaryKey(Integer id);
    /**
     * 查询所有信息
     * @return
     */
    List<TaxOrgan1> listAllTaxOrgan();
}