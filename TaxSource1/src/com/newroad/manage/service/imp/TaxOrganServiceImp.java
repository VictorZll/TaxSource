package com.newroad.manage.service.imp;

import java.util.List;

import com.newroad.manage.dao.TaxOrgan1Mapper;
import com.newroad.manage.entity.TaxOrgan1;
import com.newroad.manage.service.TaxOrganServiceIf;
import com.newroad.util.MyBatisUtil;

public class TaxOrganServiceImp implements TaxOrganServiceIf{
	TaxOrgan1Mapper dao=MyBatisUtil.getSession().getMapper(TaxOrgan1Mapper.class);
	@Override
	public List<TaxOrgan1> listAllTaxOrgan() {
		
		return dao.listAllTaxOrgan();
	}

}
