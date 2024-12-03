package com.sunbeam;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Profile")
public class ProfileServlet extends HttpServlet {
	
	
	
	

// Client --> Browser: http://localhost:8080/firstapp/hi

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Profile</title>");
		out.println("</head>");
		out.println("<body bgcolor='pink'>");
		out.println("<h1>Firstname:Bhushan</h1>");
		out.println("<h1>Lastname:Yedravkar</h1>");
		out.println("<h1>Qualification:Btech.Civil</h1>");
		out.println("<h1>CollageName:ftc</h1>");
		out.println("<h1>Birthdate:19-03-2001</h1>");
		
		out.println("</body>");
		out.println("</html>");
	}
}
