package com.newroad.manage.dao;

import java.util.List;

import com.newroad.manage.entity.TaxOrgan;

public interface TaxOrganMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaxOrgan record);

    int insertSelective(TaxOrgan record);

    TaxOrgan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaxOrgan record);

    int updateByPrimaryKey(TaxOrgan record);
    
    List<TaxOrgan> listAllTaxOrgan();
}