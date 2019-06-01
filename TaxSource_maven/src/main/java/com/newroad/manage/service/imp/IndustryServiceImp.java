package com.newroad.manage.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.newroad.manage.dao.IndustryMapper;
import com.newroad.manage.entity.Industry;
import com.newroad.manage.service.IndustryServiceIf;
@Service
@Transactional
public class IndustryServiceImp implements IndustryServiceIf {
	@Resource
	IndustryMapper dao;

	@Override
	public List<Industry> listAllIndustry() {
		// TODO Auto-generated method stub
		return dao.listAllIndustry();
	}

}
