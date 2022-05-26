package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num3"));
		int j = Integer.parseInt(req.getParameter("num4"));
		
		int sub = i - j;
		
		PrintWriter writer = res.getWriter();
		writer.println(sub);
	}
}
