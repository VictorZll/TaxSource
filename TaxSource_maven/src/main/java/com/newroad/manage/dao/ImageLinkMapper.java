package com.newroad.manage.dao;

import com.newroad.manage.entity.ImageLink;

public interface ImageLinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImageLink record);

    int insertSelective(ImageLink record);

    ImageLink selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImageLink record);

    int updateByPrimaryKey(ImageLink record);
}