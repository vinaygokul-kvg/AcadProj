package com.cbc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cbc.model.bo.LoanDAO;
import com.cbc.model.bo.LoanDAOImpl;
import com.cbc.model.pojo.Loan;

/**
 * Servlet implementation class IndividualCustomerDetails
 */
@WebServlet("/IndividualCustomerDetails")
public class IndividualCustomerDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndividualCustomerDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int loanid=Integer.parseInt(request.getParameter("loanid"));
		LoanDAO ld=new LoanDAOImpl();
		Loan l=ld.showByLoanId(loanid);
		request.setAttribute("customerdetails", l);
				
		
		request.getRequestDispatcher("IndividualCustomerDetails.jsp").include(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
