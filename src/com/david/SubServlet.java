package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SubServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num3"));
		int j = Integer.parseInt(req.getParameter("num4"));
		
		int sub = i - j;
		
//		req.setAttribute("k", sub);
		
//		RequestDispatcher rd = req.getRequestDispatcher("sqr");
//		rd.forward(req, res);
		HttpSession session = req.getSession();
		session.setAttribute("k", sub);
		
		res.sendRedirect("sqr");
		
		PrintWriter writer = res.getWriter();
		writer.println(sub);
		
	}
}
