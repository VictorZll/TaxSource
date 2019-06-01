package com.newroad.system.service;

import com.newroad.system.entity.User;

public interface UserServiceIf {
	
	User getById(Integer id);
	
	User login(String username,String pwd);

}
