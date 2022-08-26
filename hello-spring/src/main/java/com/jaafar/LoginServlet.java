package com.jaafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = ("/login"))
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest requset, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Page Title</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>This is a Heading</h1>");
		out.println("<p>This is a paragraph.</p>");
		out.println("</body>");
		out.println("</html>");

	}

}
