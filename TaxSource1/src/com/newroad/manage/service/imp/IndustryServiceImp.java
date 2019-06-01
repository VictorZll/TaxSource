package com.newroad.manage.service.imp;

import java.util.List;

import com.newroad.manage.dao.Industry1Mapper;
import com.newroad.manage.entity.Industry1;
import com.newroad.manage.service.IndustryServiceIf;
import com.newroad.util.MyBatisUtil;

public class IndustryServiceImp implements IndustryServiceIf {
	
	Industry1Mapper dao=MyBatisUtil.getSession().getMapper(Industry1Mapper.class);

	@Override
	public List<Industry1> listAllIndustry() {
		// TODO Auto-generated method stub
		return dao.listAllIndustry();
	}

}
