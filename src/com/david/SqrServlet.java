package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqrServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		// out.println("Hello From Square");

//		int k = Integer.parseInt(req.getParameter("k"));
		
//		For Session
//		HttpSession session  = req.getSession();
//		
//		int k = (int) session.getAttribute("k");
		
		
//		Using Cookies
		Cookie cookies[] = req.getCookies();
		int k = 0;
		
		for(Cookie c : cookies ) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}

		k = k * k;
		//String home = "http://localhost:8085/DemoApp";
		out.println("Square is :" + k);
	}
}
