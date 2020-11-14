package com.jsp.jsppractice01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Nana")
public class Home extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
//		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String title = request.getParameter("title");
		String area = request.getParameter("area");
			
		out.println(title + "<br>");
		out.println(area + "<br>");
		
			
		}
		
	
	
	}
	

