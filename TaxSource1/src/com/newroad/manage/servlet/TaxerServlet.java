package com.newroad.manage.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.newroad.base.BaseServlet;
import com.newroad.manage.entity.Taxer1;
import com.newroad.manage.service.TaxerServiceIf;
import com.newroad.manage.service.imp.TaxerServiceImp;

@WebServlet("/manage/taxer.do")
@SuppressWarnings("serial")
public class TaxerServlet extends BaseServlet {
	TaxerServiceIf service = new TaxerServiceImp();
@Override
public void list(HttpServletRequest request, HttpServletResponse response) {
	List<Taxer1> taxers=service.getTaxers();
	JSONArray array=JSONArray.parseArray(JSONArray.toJSONString(taxers));
	try {
		printJSONArray(array, response);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
