package com.newroad.manage.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.alibaba.fastjson.JSONObject;
import com.newroad.base.BaseServlet;

@WebServlet("/manage/upload.do")
@MultipartConfig
@SuppressWarnings("serial")
public class UploadServlet extends BaseServlet {
	@Override
	public void upload(HttpServletRequest req, HttpServletResponse resp) {
	Collection<Part> parts;
	try {
		parts = req.getParts();
		for(Part p:parts) {
			String pType=p.getName();
			if(!"file".equals(pType)) {
				continue;//-------------------------不是文件则跳过
			}
			if(p.getSize()==0) {
				continue;//-------------------------空文件则跳过	
			}
			//约定upload
			//执行到这一行，开始处理文件上传
			String fileName=p.getSubmittedFileName();//----------------获取上传的文件名
			String realPath=req.getServletContext().getRealPath("");//---------获取真实路径
			System.out.println(realPath);
			File parentFile=new File(realPath).getParentFile();//---------------获取父级路径
			File downDirectory=new File(parentFile,"upload"+req.getContextPath());//--获取存储路径
			downDirectory.mkdirs();
			//开始读写
			String uuid=UUID.randomUUID().toString();
			InputStream in=p.getInputStream();
			FileOutputStream out=new FileOutputStream(new File(downDirectory,uuid+"_"+fileName));
			byte[] b=new byte[1024];
			int num=0;
			while((num=in.read(b))!=-1) {
				out.write(b, 0, num);
			}
			in.close();
			out.close();
			resp.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charset=utf-8");
			String path="upload"+req.getContextPath()+"/"+uuid+"_"+fileName;
			JSONObject jobj=new JSONObject();
			jobj.put("name", fileName);
			jobj.put("url", path);
			printJSONObject(jobj, resp);
			
		}
	} catch (IOException | ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}}
