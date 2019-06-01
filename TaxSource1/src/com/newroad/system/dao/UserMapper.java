package com.newroad.system.dao;

import org.apache.ibatis.annotations.Param;

import com.newroad.system.entity.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    /**
     * 登陆的方法
     * @param name
     * @param pwd
     * @return
     */
    User login(@Param("name")String name,@Param("pwd")String pwd);
}