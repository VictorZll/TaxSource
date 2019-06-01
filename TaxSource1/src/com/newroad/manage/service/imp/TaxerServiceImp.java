package com.newroad.manage.service.imp;

import java.util.List;

import com.newroad.manage.dao.Taxer1Mapper;
import com.newroad.manage.entity.Taxer1;
import com.newroad.manage.service.TaxerServiceIf;
import com.newroad.util.MyBatisUtil;

public class TaxerServiceImp implements TaxerServiceIf {
	Taxer1Mapper dao=MyBatisUtil.getSession().getMapper(Taxer1Mapper.class);
	/**
	 * 查询所有办事员信息
	 */
	@Override
	public List<Taxer1> getTaxers() {
		return dao.getTaxers();
	}

}
