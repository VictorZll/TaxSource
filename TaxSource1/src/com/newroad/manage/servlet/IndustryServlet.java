package com.newroad.manage.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.newroad.base.BaseServlet;
import com.newroad.manage.entity.Industry1;
import com.newroad.manage.service.IndustryServiceIf;
import com.newroad.manage.service.imp.IndustryServiceImp;
@WebServlet("/manage/industry.do")
@SuppressWarnings("serial")
public class IndustryServlet extends BaseServlet {
	IndustryServiceIf service = new IndustryServiceImp();
	@Override
	public void list(HttpServletRequest request, HttpServletResponse response) {
		List<Industry1> industries = service.listAllIndustry();
		JSONArray array = JSONArray.parseArray(JSONArray.toJSONString(industries));
		try {
			printJSONArray(array, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
