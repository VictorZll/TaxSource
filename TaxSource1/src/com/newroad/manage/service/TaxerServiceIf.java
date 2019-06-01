package com.newroad.manage.service;

import java.util.List;

import com.newroad.manage.entity.Taxer1;

public interface TaxerServiceIf {
	/**
	 * 查询所有信息
	 * @return
	 */
	List<Taxer1> getTaxers();
}
