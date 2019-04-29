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
import com.cbc.model.pojo.Refund;

/**
 * Servlet implementation class UpdateCbc
 */
@WebServlet("/RefundCbc.do")
public class RefundCbc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RefundCbc() {
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
		long account_number=Long.parseLong(request.getParameter("accnum"));
		String customer_name=request.getParameter("cusname");
		String refund_date=request.getParameter("cbdate");
		double chargeback_amount=Double.parseDouble(request.getParameter("newchargebackamt"));
		String reason=request.getParameter("reason");
		String refund_status=request.getParameter("refund_status");
		double refund_amount=Double.parseDouble(request.getParameter("refund_amount"));
		String comments=request.getParameter("Comments");
		
		try {
			SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd");
			Date chargebackDate=sd1.parse(refund_date);
			Refund cbc=new Refund(customer_name, account_number, chargeback_amount, chargebackDate, reason, refund_status, refund_amount, comments);	
			ChargeBackDAO cbd=new ChargeBackDAOImpl();
			int status=cbd.insertRefund(cbc);
			if(status==1)
			{
				request.getRequestDispatcher("UserHome.jsp").forward(request, response);
			}
			else
			{
				pw.println(" <center><br><br><br><br><br><br><br><br> <span style=color:red;font-size:10px;>Update Failed</span></br></br></br></br></br></br></br></br></center>");
				request.getRequestDispatcher("cbcrefund.jsp").include(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
