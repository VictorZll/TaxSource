package com.newroad.system.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.newroad.system.dao.UserMapper;
import com.newroad.system.entity.User;
import com.newroad.system.service.UserServiceIf;
@Resource
@Transactional
public class UserServiceImp implements UserServiceIf {
	@Resource
	UserMapper dao;

	@Override
	public User getById(Integer id) {
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public User login(String username, String pwd) {
		System.out.println("dao="+dao);
		return dao.login(username, pwd);
	}

}
