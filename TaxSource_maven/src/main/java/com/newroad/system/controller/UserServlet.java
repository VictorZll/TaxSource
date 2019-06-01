//package com.newroad.system.controller;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.alibaba.fastjson.JSONObject;
//import com.newroad.base.BaseServlet;
//import com.newroad.system.entity.User;
//import com.newroad.system.service.UserServiceIf;
//import com.newroad.system.service.imp.UserServiceImp;
//
//@WebServlet("/manage/system/user.do")
//@SuppressWarnings("serial")
//public class UserServlet extends BaseServlet {
//	UserServiceIf service=new UserServiceImp();
//	@Override
//	public void list(HttpServletRequest request, HttpServletResponse response) {
//		//System.out.println("list");
//	String pageStr=request.getParameter("page");
//	String rowsStr=request.getParameter("rows");
//	int page=pageStr==null?1:Integer.parseInt(pageStr);
//	int rows=rowsStr==null?10:Integer.parseInt(rowsStr);
//	if(page<1) {
//		page=1;
//	}
//	//总记录数
//	double count=service.getCount();
//	//计算总页数
//	int pageCount=(int) Math.ceil(count/rows);
//	//取整可能取到0，所以判断一下
//	pageCount=pageCount>0?pageCount:1;
//	if(page>pageCount) {
//		page=pageCount;
//	}
//	//数据合法性
//	int offset=(page-1)*rows;
//	List<User> list=service.list(offset, rows);
//	int num=service.getCount();
//	JSONObject jobj=new JSONObject();
//	jobj.put("total", num);
//	jobj.put("rows", list);
//	try {
//		printJSONObject(jobj, response);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	}
//
//}
