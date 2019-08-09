package com.harshit.catalogServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PaymentServlet
 */
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	HttpSession httpSession = request.getSession();
	
	PrintWriter out = response.getWriter();
	
	response.setContentType("text/html");
	
	out.println("<h3> Thank you "+httpSession.getAttribute("guestName") +" </h3>");
	out.println("<h3> your total bill amount is "+ httpSession.getAttribute("totalAmount")+" </h3>");
	}

}
