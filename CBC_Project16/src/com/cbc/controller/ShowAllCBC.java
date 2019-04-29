package com.cbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cbc.model.bo.ChargeBackDAO;
import com.cbc.model.bo.ChargeBackDAOImpl;
import com.cbc.model.bo.LoanDAO;
import com.cbc.model.bo.LoanDAOImpl;
import com.cbc.model.pojo.ChargeBack;
import com.cbc.model.pojo.Loan;

/**
 * Servlet implementation class ShowAllCBC
 */
@WebServlet("/ShowAllCBC.do")
public class ShowAllCBC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllCBC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		ChargeBackDAO cbd=new ChargeBackDAOImpl();
		List<ChargeBack> cbc_list=cbd.showAll();
		request.setAttribute("cbclist", cbc_list);
		request.getRequestDispatcher("showallcbc.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
