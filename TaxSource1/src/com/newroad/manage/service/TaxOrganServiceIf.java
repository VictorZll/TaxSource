package com.newroad.manage.service;

import java.util.List;

import com.newroad.manage.entity.TaxOrgan1;

public interface TaxOrganServiceIf {
	/**
	 * 查询所有的税务部门信息
	 * @return
	 */
	List<TaxOrgan1> listAllTaxOrgan();

}
