package com.newroad.system.service.imp;

import com.newroad.system.dao.UserMapper;
import com.newroad.system.entity.User;
import com.newroad.system.service.UserServiceIf;
import com.newroad.util.EncryptUtil;
import com.newroad.util.MyBatisUtil;

public class UserServiceImp implements UserServiceIf {
	UserMapper dao=MyBatisUtil.getSession().getMapper(UserMapper.class);
	@Override
	public User login(String username, String password) {
		if(username==null||username.length()==0||password==null||password.length()==0) {
			return null;
		}
		//加密
		String pwd=EncryptUtil.encryptMD5(password);
		//执行查询
		User user=dao.login(username, pwd);
		return user;
	}


}
