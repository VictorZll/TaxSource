package com.newroad.manage.dao;

import java.util.List;

import com.newroad.manage.entity.Industry1;

public interface Industry1Mapper {
    int insert(Industry1 record);

    int insertSelective(Industry1 record);

    Industry1 selectByPrimaryKey(Integer id);
    /**
     * 查询所有信息
     * @return
     */
    List<Industry1> listAllIndustry();
}