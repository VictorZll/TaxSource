package com.newroad.manage.dao;

import com.newroad.manage.entity.AttachmentInfo;

public interface AttachmentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AttachmentInfo record);

    int insertSelective(AttachmentInfo record);

    AttachmentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AttachmentInfo record);

    int updateByPrimaryKey(AttachmentInfo record);
}