package com.newroad.manage.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.newroad.base.BaseServlet;
import com.newroad.manage.entity.TaxPayer;
import com.newroad.manage.service.TaxPayerServiceIf;
import com.newroad.util.ApplicationContextHolder;
import com.newroad.util.BeanUtil;

@WebServlet("/manage/taxpayer.do")
@SuppressWarnings("serial")
public class TaxPayerServlet extends BaseServlet {
	//获得Service对象
		TaxPayerServiceIf service=ApplicationContextHolder.getBean(TaxPayerServiceIf.class);
	/**
	 * 重写page方法，要修改修饰符为public
	 */
	@Override
	public void page(HttpServletRequest request, HttpServletResponse response) {
		//从请求中获取page,rows,payerCode,payerName
		String pageStr=request.getParameter("page");
		String rowsStr=request.getParameter("rows");
		String payerCode = request.getParameter("payerCode");
		String payerName = request.getParameter("payerName");
		//查询数据
		List<TaxPayer> list=service.listByPage(pageStr, rowsStr,payerCode,payerName);
		int count=service.getCount(payerCode,payerName);
		//返回数据
		JSONObject jobj=new JSONObject();
		jobj.put("total", count);
		jobj.put("rows", list);
		try {
			//父类无异常，子类不可抛
			printJSONObject(jobj, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 重写edit方法，先获得选中的Taxpayer对象，并回填到前端
	 */
	@Override
	public void edit(HttpServletRequest request, HttpServletResponse response) {
		//从request中获得参数
		String payerCode=request.getParameter("payerCode");
		//根据参数获得要修改的对象
		TaxPayer taxPayer=service.getSingleData(payerCode);
		//request.getSession().setAttribute("taxPayer", taxPayer);
		//要回填的对象格式
		JSONObject jobj=(JSONObject) JSON.toJSON(taxPayer);
		try {
			printJSONObject(jobj, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void save(HttpServletRequest request, HttpServletResponse response) {
		Map<String,String[]> map1=request.getParameterMap();
		Map<String,String> map=new HashMap<>();
		map1.forEach((k,v)->{map.put(k, v[0]);});
		TaxPayer taxPayer=new TaxPayer();
		BeanUtil.mapToBean(taxPayer, map);
		boolean flage=service.add(taxPayer);
		JSONObject jobj=new JSONObject();
		jobj.put("success", flage);
		try {
			printJSONObject(jobj, response);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 删除的方法
	 */
	@Override
	public void remove(HttpServletRequest request, HttpServletResponse response) {
		try {
			String payerCode=request.getParameter("payerCode");
			boolean flage=service.remove(payerCode);
			JSONObject jobj=new JSONObject();
			jobj.put("success", flage);
			printJSONObject(jobj, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 查询单条数据
	 * 验证唯一性
	 */
	@Override
	public void get(HttpServletRequest request, HttpServletResponse response) {
	String payerCode=request.getParameter("payerCode");
	boolean flage=service.isRepeat(payerCode);
	JSONObject jobj=new JSONObject();
	jobj.put("isRepeat", flage);
	try {
		printJSONObject(jobj, response);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	/**
	 * 修改的方法
	 */
	@Override
	public void update(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("update方法执行了");
		Map<String,String[]> map1=request.getParameterMap();
		String payerCode=request.getParameter("payerCode");//
		Map<String,String> map=new HashMap<>();
		map1.forEach((k,v)->{map.put(k, v[0]);});
		TaxPayer taxPayer=new TaxPayer();
		BeanUtil.mapToBean(taxPayer, map);
		System.out.println("servlet="+taxPayer.getTaxorganid());
		boolean flage=service.update(taxPayer,payerCode);
		JSONObject jobj=new JSONObject();
		jobj.put("success", flage);
		try {
			printJSONObject(jobj, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
