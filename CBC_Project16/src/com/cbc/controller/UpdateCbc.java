package com.cbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cbc.model.bo.ChargeBackDAO;
import com.cbc.model.bo.ChargeBackDAOImpl;
import com.cbc.model.pojo.ChargeBack;

/**
 * Servlet implementation class UpdateCbc
 */
@WebServlet("/UpdateCbc.do")
public class UpdateCbc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCbc() {
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
		long accno=Long.parseLong(request.getParameter("accnum"));
		String cusname=request.getParameter("cusname");
		String cbdate=request.getParameter("cbdate");
		double newchargebackamt=Double.parseDouble(request.getParameter("newchargebackamt"));
		String reason=request.getParameter("reason");
		try {
			SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd");
			Date chargebackDate=sd1.parse(cbdate);
			ChargeBack cbc=new ChargeBack(cusname, accno, newchargebackamt, chargebackDate, reason);	
			ChargeBackDAO cbd=new ChargeBackDAOImpl();
			int status=cbd.updateCbc(cbc);
			if(status==1)
			{
				request.getRequestDispatcher("UserHome.jsp").forward(request, response);
			}
			else
			{
				pw.println(" <center><br><br><br><br><br><br><br><br> <span style=color:red;font-size:10px;>Update Failed</span></br></br></br></br></br></br></br></br></center>");
				request.getRequestDispatcher("cbcstatusupdate.jsp").include(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
