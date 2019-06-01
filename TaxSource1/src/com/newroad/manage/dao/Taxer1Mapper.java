package com.newroad.manage.dao;

import java.util.List;

import com.newroad.manage.entity.Taxer1;

public interface Taxer1Mapper {
    int insert(Taxer1 record);

    int insertSelective(Taxer1 record);

    Taxer1 selectByPrimaryKey(Integer id);
    /**
             * 查询所有记录()
     * @return
     */
    List<Taxer1> getTaxers();
}