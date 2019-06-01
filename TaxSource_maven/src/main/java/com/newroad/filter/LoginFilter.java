package com.newroad.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.newroad.system.entity.User;
import com.newroad.util.MyBatisUtil;

/**
 * 登陆验证过滤器
 * @author Administrator
 *
 */
@WebFilter(urlPatterns = {"/manage/*"})
public class LoginFilter implements Filter {

	@Override
	public void destroy() {
	System.out.println("过滤器被销毁了");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse resp=(HttpServletResponse) response;
		//获取session
		User user=(User) req.getSession().getAttribute("user");
		//测试
		if(user==null) {
			//测试
			//chain.doFilter(req, resp);
			resp.sendRedirect(req.getContextPath()+"/login.jsp");
		}else {
			//这里传递的是ServletRequest，ServletResponse
			chain.doFilter(req, resp);
		}
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	
		System.out.println("过滤器被初始化了");
		
	}
	

}
