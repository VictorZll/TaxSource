package com.newroad.manage.dao;

import java.util.List;

import com.newroad.manage.entity.Industry;

public interface IndustryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Industry record);

    int insertSelective(Industry record);

    Industry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Industry record);

    int updateByPrimaryKey(Industry record);
    
    List<Industry> listAllIndustry();
}