package com.newroad.manage.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONObject;
import com.newroad.base.BaseServlet;
import com.newroad.system.entity.User;

@WebServlet("/manage/index.do")
@SuppressWarnings("serial")
public class IndexServlet extends BaseServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	//从请求获取session
	HttpSession session=request.getSession();
	//从session获取登陆的用户信息
	User user=(User) session.getAttribute("user");
	//获取用户名
	String name=user.getUsername();
	JSONObject jobj=new JSONObject();
	jobj.put("name", name);
	System.out.println("name="+name);
	printJSONObject(jobj, response);
}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	doGet(request, response);
	}
}
