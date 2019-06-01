package com.newroad.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import com.newroad.util.MyBatisUtil;

@WebListener
public class RequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent event) {
		HttpServletRequest request=(HttpServletRequest) event.getServletRequest();
		SqlSession session=(SqlSession) request.getAttribute("session");
		session.commit();
		session.close();
		
	}
	@Override
	public void requestInitialized(ServletRequestEvent event) {
		SqlSession session=MyBatisUtil.getSession();
		HttpServletRequest request=(HttpServletRequest) event.getServletRequest();
		request.setAttribute("session", session);
		
	}
}
