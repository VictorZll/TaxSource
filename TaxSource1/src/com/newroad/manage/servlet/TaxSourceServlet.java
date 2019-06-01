package com.newroad.manage.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.newroad.base.BaseServlet;
import com.newroad.manage.entity.TaxSource1;
import com.newroad.manage.service.TaxSourceServiceIf;
import com.newroad.manage.service.imp.TaxSourceSerrviceImp;
import com.newroad.util.BeanUtil;

/**
 * 处理文字//重写save方法
 * 处理文件上传//重写upload方法
 * @author Administrator
 *
 */
@WebServlet("/manage/taxSource.do")
@SuppressWarnings("serial")
public class TaxSourceServlet extends BaseServlet {
	//TaskServiceIf service=new TaskServiceImp();
	TaxSourceServiceIf service=new TaxSourceSerrviceImp();
@Override
public void get(HttpServletRequest request, HttpServletResponse response) {
	String id=request.getParameter("id");
	TaxSource1 t=service.getTaxSourceById(id);
	JSONObject jobj=(JSONObject) JSON.toJSON(t);
	try {
		printJSONObject(jobj, response);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}	
@Override
public void remove(HttpServletRequest request, HttpServletResponse response) {
	String idStr=request.getParameter("id");
	System.out.println("id="+idStr);
	boolean flage=service.remove(idStr);
	JSONObject jobj=new JSONObject();
	jobj.put("success", flage);
	try {
		printJSONObject(jobj, response);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}	
@Override
public void save(HttpServletRequest request, HttpServletResponse response) {
	//不能使用request.getParameterMap()
	String kind=request.getParameter("kind");
	boolean flage=false;
	if("img".equals(kind)){
		String url=request.getParameter("url");
		String info=request.getParameter("info");
		Object[] values= {url,info};
		flage=service.addImg(values);
	}
	if("text".equals(kind)) {
		Map<String, String[]> map1=request.getParameterMap();
		Map<String, String> map=new HashMap<>();
		map1.forEach((k,v)->{
			map.put(k, v[0]);
		});
		TaxSource1 t=new TaxSource1();
		//待修改
		BeanUtil.mapToBean(t, map);
		flage=service.addTaxSource(t);
	}

	
	JSONObject jobj=new JSONObject();
	jobj.put("success", flage);
	//imgURLMap.forEach((k,v)->System.out.println(k+"->"+v));

	try {
		printJSONObject(jobj, response);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@Override
public void page(HttpServletRequest request, HttpServletResponse response) {
	//从请求中获取page,rows,payerCode,payerName
	String pageStr=request.getParameter("page");
	String rowsStr=request.getParameter("rows");
	String payerCode = request.getParameter("payerCode");
	String payerName = request.getParameter("payerName");
	String organId = request.getParameter("taxorganid");
	String industryId=request.getParameter("industryid");
	String beginTime=request.getParameter("beginTime");
	String endTime=request.getParameter("endTime");
	String[] conditions= {payerCode,payerName,organId,industryId,beginTime,endTime};
	//查询数据
	List<TaxSource1> list=service.listByPage(pageStr, rowsStr,conditions);
	double count=service.getCount(conditions);
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
}
