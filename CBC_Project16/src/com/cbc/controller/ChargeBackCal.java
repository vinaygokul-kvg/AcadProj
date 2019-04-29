package com.cbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cbc.model.bo.ChargeBackDAO;
import com.cbc.model.bo.ChargeBackDAOImpl;
import com.cbc.model.bo.EmiDAO;
import com.cbc.model.bo.EmiDAOImpl;
import com.cbc.model.pojo.ChargeBack;

/**
 * Servlet implementation class ChargeBackCal
 */
@WebServlet("/ChargeBackCal.do")
public class ChargeBackCal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChargeBackCal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int loanid=Integer.parseInt(request.getParameter("loanid"));
		ChargeBackDAO cbd=new ChargeBackDAOImpl();
		ChargeBack cbc=cbd.calculateChargeback(loanid);
		if(cbc!=null)
		{
		System.out.println("CBC in Caluculate : "+cbc);
		int status=cbd.insertCBC(cbc);
		if(status==1)
		{
			request.setAttribute("cbc", cbc);
			request.getRequestDispatcher("cbcdisplay.jsp").forward(request, response);
		}
		else
		{
			pw.println(" <center><br><br><br><br><br><br><br><br> <span style=color:red;font-size:30px;>Charge Back Already Updated for Loan ID : "+loanid +"</span></br></br></br></br></br></br></br></br></center>");
			request.getRequestDispatcher("cbcdisplay.jsp").include(request, response);
		}
		}else {
			pw.println(" <center><br><br><br><br><br><br><br><br> <span style=color:red;font-size:30px;>Charge Back Not Applicable for Loan ID : "+loanid +"</span></br></br></br></br></br></br></br></br></center>");
			request.getRequestDispatcher("cbcdisplay.jsp").include(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
