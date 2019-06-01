package com.newroad.system.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONObject;
import com.newroad.base.BaseServlet;

@WebServlet("/validate.do")
@SuppressWarnings("serial")
public class ValidateServlet extends BaseServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession();
	String kaptcha=(String) session.getAttribute("KAPTCHA_SESSION_KEY");
	
	String kaptcha2=req.getParameter("kaptcha");
	boolean flage=false;
	if(kaptcha!=null&&kaptcha2!=null) {
		if(kaptcha.equals(kaptcha2)) {
			flage=true;
		}
	}
	JSONObject jobj=new JSONObject();
	jobj.put("success",flage);
	printJSONObject(jobj, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req, resp);
	}
}
