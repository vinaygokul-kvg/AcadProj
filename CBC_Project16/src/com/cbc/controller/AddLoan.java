package com.cbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cbc.model.bo.LoanDAO;
import com.cbc.model.bo.LoanDAOImpl;
import com.cbc.model.pojo.Loan;

/**
 * Servlet implementation class AddLoan
 */
@WebServlet("/AddLoan.do")
public class AddLoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLoan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		long accno=Long.parseLong(request.getParameter("accno"));
		String custname=request.getParameter("custname");
		double loan_amount=Double.parseDouble(request.getParameter("loanamount"));
		double irate=Double.parseDouble(request.getParameter("irate"));
		int noofyears=Integer.parseInt(request.getParameter("noofyears"));
		
		
		double emi = (loan_amount + (loan_amount * (irate / 100))) / (noofyears * 12);
		Loan l=new Loan(accno, custname, loan_amount, noofyears, irate, new Date(), emi);
		LoanDAO ld=new LoanDAOImpl();
		int status=ld.addLoan(l);
		if(status==1)
		{
			request.getRequestDispatcher("AddLoan.jsp").forward(request, response);
		}
		else
		{
			pw.println(" <center><br><br><br><br><br><br><br><br> <span style=color:red;font-size:10px;>Invalid User ID (or)\r\n" + 
					"Incorrect Password</span></br></br></br></br></br></br></br></br></center>");
			request.getRequestDispatcher("AddLoan.jsp").include(request, response);
		}
		
		
	}

}
