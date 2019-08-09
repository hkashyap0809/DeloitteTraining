package com.harshit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public Welcome() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	int counter=0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		counter++;
		response.setContentType("text/html");
		String gn = request.getParameter("guestName");
		//String[] colorName = request.getParameterValues("color");
		response.getWriter().println("<h1> Hello "+gn+" Welcome.</h1>");
		response.getWriter().println("<h1> You are visitor no : "+counter +"</h1>");
//		
//		for(String color:colorName) {
//			response.getWriter().println("<font color="+color+">Hello "+gn+" !</font><br/>");
//		}
		
		Cookie allCookies[] = request.getCookies();
		boolean visited=false; 
		if (allCookies!=null) {
			for (Cookie c : allCookies) {
				if (c.getName().equals(gn)) {
					visited = true;
					break;
				}

			} 
		}
		if(visited) {
			response.getWriter().println("<h1> you have visited</h1>");
		}else {
			response.getWriter().println("<h1> you are visiting for the first time </h1>");
		}

		if(gn.equalsIgnoreCase("harshit")) {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("HelloServlet");
		requestDispatcher.forward(request, response);
		}else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("InvalidServlet");
			requestDispatcher.forward(request, response);
		}
		
		
	}

}
