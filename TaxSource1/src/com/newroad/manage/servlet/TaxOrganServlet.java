package com.newroad.manage.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.newroad.base.BaseServlet;
import com.newroad.manage.entity.TaxOrgan1;
import com.newroad.manage.service.TaxOrganServiceIf;
import com.newroad.manage.service.imp.TaxOrganServiceImp;

@WebServlet("/manage/taxOrgan.do")
@SuppressWarnings("serial")
public class TaxOrganServlet extends BaseServlet {
	TaxOrganServiceIf service = new TaxOrganServiceImp();
	@Override
	public void list(HttpServletRequest request, HttpServletResponse response) {
	
		List<TaxOrgan1> taxOrgans = service.listAllTaxOrgan();
		JSONArray array = JSONArray.parseArray(JSONArray.toJSONString(taxOrgans));
		try {
			printJSONArray(array, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
