package com.newroad.system.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.newroad.base.BaseServlet;
import com.newroad.system.entity.User;
import com.newroad.system.service.UserServiceIf;
import com.newroad.system.service.imp.UserServiceImp;

@WebServlet("/login.do")
@SuppressWarnings("serial")
public class LoginServlet extends BaseServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//String isRemember=req.getParameter("remember");	
	String username=req.getParameter("uname");
	String pwd=req.getParameter("pwd");
	UserServiceIf userService=new UserServiceImp();
	boolean flage=false;

	//调用service执行登陆
	User user=userService.login(username, pwd);

	/*
	 * 在前端使用jq插件设置完成
	if("true".equals(isRemember)) {
		//将用户名密码存到cookie
		Cookie c1=new Cookie("uname", username);
		Cookie c2=new Cookie("pwd",pwd);
		//设置有效时常
		c1.setMaxAge(3600);
		c2.setMaxAge(3600);
		resp.addCookie(c1);
		resp.addCookie(c2);
	}
	*/
	if(user==null||user.getState()!=1) {
		flage=false;
	}else{
		//用ajax跳转
		flage=true;
		//成功登陆则向session存一个对象
		req.getSession().setAttribute("user", user);
	}
	JSONObject jobj=new JSONObject();
	jobj.put("success", flage);
	printJSONObject(jobj, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req, resp);
	}
}
