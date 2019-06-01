package com.newroad.manage.service;

import java.util.List;

import com.newroad.manage.entity.Industry;

public interface IndustryServiceIf {
	/**
	 * 查询出所有的行业信息
	 * @return
	 */
	List<Industry> listAllIndustry();

}
