package com.newroad.manage.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.newroad.manage.dao.TaxOrganMapper;
import com.newroad.manage.entity.TaxOrgan;
import com.newroad.manage.service.TaxOrganServiceIf;
@Service
@Transactional
public class TaxOrganServiceImp implements TaxOrganServiceIf{
	@Resource
	TaxOrganMapper dao;
	@Override
	public List<TaxOrgan> listAllTaxOrgan() {
		
		return dao.listAllTaxOrgan();
	}

}
