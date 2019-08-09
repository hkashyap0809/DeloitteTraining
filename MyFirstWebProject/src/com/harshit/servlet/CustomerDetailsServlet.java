package com.harshit.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.harshit.entity.Customer;
import com.harshit.persistence.CustomerDAOInterface;
import com.harshit.persistence.impl.CustomerDAOImpl;

/**
 * Servlet implementation class CustomerDetailsServlet
 */
public class CustomerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerDetailsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int customerId = Integer.parseInt(request.getParameter("customerId"));	
		String customerName = request.getParameter("customerName");
		String customerAddress=request.getParameter("customerAddress");
		int billAmount = Integer.parseInt(request.getParameter("billAmount"));

		response.getWriter().println("<h1>"+customerId+"\t"+customerName+"\t"+customerAddress+"\t"+billAmount+"</h1>");

		Customer customer = new Customer(customerId, customerName, customerAddress, billAmount);
		CustomerDAOInterface customerDAO = new CustomerDAOImpl();
		boolean result=false;
		try {
			 result = customerDAO.insertCustomer(customer);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result) {
			response.getWriter().println("<h2> Record Inserted </h2>");
		}else {
			response.getWriter().println("<h2> Record not inserted </h2>");
		}
		

	}

}
