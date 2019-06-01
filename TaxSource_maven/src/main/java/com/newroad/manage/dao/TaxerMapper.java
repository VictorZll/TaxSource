package com.newroad.manage.dao;

import java.util.List;

import com.newroad.manage.entity.Taxer;

public interface TaxerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Taxer record);

    int insertSelective(Taxer record);

    Taxer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Taxer record);

    int updateByPrimaryKey(Taxer record);
    
    List<Taxer> getAllTaxers();
}