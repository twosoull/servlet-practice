package com.jsp.jsppractice01.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
	
@WebFilter("/*")
public class Filterjsp implements Filter, com.sun.org.apache.xalan.internal.xsltc.dom.Filter {

	@Override
	public boolean test(int node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("hello filter");
		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);
		response.setCharacterEncoding("UTF-8");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
