package com.newroad.system.dao;

import org.apache.ibatis.annotations.Param;

import com.newroad.system.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User login(@Param("username")String username,@Param("pwd")String pwd);
}