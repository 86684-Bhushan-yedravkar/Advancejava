package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunbeam.PojoMarks;



@WebServlet("/result")
public class ResultServlet extends HttpServlet {
	List<PojoMarks> l;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		l = new ArrayList<PojoMarks>();
		l.add(new PojoMarks("Maths", 60));
		l.add(new PojoMarks("Hindi", 70));
		l.add(new PojoMarks("Science", 80));	
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>PojoMarks</title></head><body>");							
		out.println("<h1>PojoMarks and Subjects</h1>");									
		for (PojoMarks m : l) {
			out.println("<h3>"+ m +"</h3>");												
		}
		out.println("</body></html>");
	}
}