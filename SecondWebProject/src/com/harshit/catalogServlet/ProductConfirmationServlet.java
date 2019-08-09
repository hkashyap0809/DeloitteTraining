package com.harshit.catalogServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductConfirmationServlet
 */
public class ProductConfirmationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductConfirmationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		HttpSession httpSession = request.getSession();
		String guestName = (String) httpSession.getAttribute("guestName");

		PrintWriter out = response.getWriter();
		out.println("Welcome "+ guestName);

		int count=1;
		String[] products = request.getParameterValues("eatables");
		response.setContentType("text/html");
		if(products==null) {
			out.println("<h2> No shopping done </h2>");
		}
		else {
			out.println("<h3> You Selected </h3>");

			for(String product : products){
				out.println("<h3>"+(count++)+" --- "+product+"</h3> ");
			}
			response.getWriter().println("<br /><h1>Yout bill amount is "+ (products.length)*10+" </h1>");	
		}
		
		int totalAmount = (products.length)*10;
		httpSession.setAttribute("totalAmount", totalAmount);
		out.println("<a href='PaymentServlet'> Go to Payment Gateway</a>");

	}

}
