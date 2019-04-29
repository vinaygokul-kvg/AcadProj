package com.cbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cbc.model.bo.LoanDAO;
import com.cbc.model.bo.LoanDAOImpl;
import com.cbc.model.pojo.Loan;

/**
 * Servlet implementation class ShowLoan
 */
@WebServlet("/ShowLoan.do")
public class ShowLoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowLoan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int val=Integer.parseInt(request.getParameter("val"));
		LoanDAO ld=new LoanDAOImpl();
		List<Loan> loan_list=ld.showAll();
		HttpSession hs=request.getSession();
		request.setAttribute("loanlist", loan_list);
		hs.setAttribute("val", val);
		request.getRequestDispatcher("showall.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
