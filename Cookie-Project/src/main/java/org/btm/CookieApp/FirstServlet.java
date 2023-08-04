package org.btm.CookieApp;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class FirstServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		
		Cookie ck=new Cookie ("nmg", name);
		ck.setMaxAge(100);
		resp.addCookie(ck);
		
		PrintWriter pw=resp.getWriter();
		pw.println("<html><body><center>"
				+ "<form action='ss'>"
				+ "<input type='submit' value='NextServlet'>"
				+ "</form></center></body></html>");
		pw.flush();
		pw.close();
	}

}
