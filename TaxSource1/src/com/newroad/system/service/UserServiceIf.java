package com.newroad.system.service;

import com.newroad.system.entity.User;

public interface UserServiceIf {
/**
 * 这个接口写一些抽象方法供子类实现
 */
	User login(String username,String password);

}
