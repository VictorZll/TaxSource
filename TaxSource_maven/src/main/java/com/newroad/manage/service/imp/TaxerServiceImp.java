package com.newroad.manage.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.newroad.manage.dao.TaxerMapper;
import com.newroad.manage.entity.Taxer;
import com.newroad.manage.service.TaxerServiceIf;
@Service
@Transactional
public class TaxerServiceImp implements TaxerServiceIf {
	@Resource
	TaxerMapper dao;
	/**
	 * 查询所有办事员信息
	 */
	@Override
	public List<Taxer> getTaxers() {
		return dao.getAllTaxers();
	}

}
