package com.cbc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cbc.model.bo.ChargeBackDAO;
import com.cbc.model.bo.ChargeBackDAOImpl;
import com.cbc.model.bo.LoanDAO;
import com.cbc.model.bo.LoanDAOImpl;
import com.cbc.model.pojo.ChargeBack;
import com.cbc.model.pojo.Loan;

/**
 * Servlet implementation class IndividualCustomerDetails
 */
@WebServlet("/IndividualCbcDetails")
public class IndividualCbcDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndividualCbcDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		long accno=Long.parseLong(request.getParameter("accno"));
		ChargeBackDAO cbd=new ChargeBackDAOImpl();
		ChargeBack cb=cbd.showById(accno);
		HttpSession hs=request.getSession();
		hs.setAttribute("cbcdetails", cb);
				
		
		request.getRequestDispatcher("IndividualCbcDetails.jsp").include(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
