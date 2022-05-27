package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int sum = i+j;
		//System.out.println(sum);
//		
//		req.setAttribute("k", sum);
//	
////		PrintWriter out = res.getWriter();
////		out.println("result is "+sum);
//		
//		RequestDispatcher rd = req.getRequestDispatcher("sqr");
//		rd.forward(req, res);
		
		
//		Using Session
//		HttpSession session = req.getSession();
//		session.setAttribute("k", sum);
		
//		res.sendRedirect("sqr?k="+sum);
		
		Cookie cookie = new Cookie("k", sum+"");
		res.addCookie(cookie);
	
		res.sendRedirect("sqr");
		
	}
}
