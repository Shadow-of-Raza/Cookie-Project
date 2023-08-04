package org.btm.CookieApp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
public class SecondServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		Cookie[] ckarr=req.getCookies();
		PrintWriter out=resp.getWriter();
		out.println("<h1> The Cookie name: " + ckarr[0].getValue() + "</h1>");
		out.flush();
		out.close();
	}

}
