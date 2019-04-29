package com.cbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cbc.model.bo.EmiDAO;
import com.cbc.model.bo.EmiDAOImpl;
import com.cbc.model.pojo.Emi;

/**
 * Servlet implementation class AddEMI
 */
@WebServlet("/AddEMI.do")
public class AddEMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEMI() {
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
			int loanid=Integer.parseInt(request.getParameter("loanid"));
			String duedate=request.getParameter("duedate");
			String paiddate=request.getParameter("paiddate");
			try {
				SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat sd2=new SimpleDateFormat("yyyy-MM-dd");
				Date d1=sd1.parse(duedate);
				Date d2=sd2.parse(paiddate);
				
				Emi emi=new Emi(loanid, d1, d2);
				EmiDAO ed=new EmiDAOImpl();
				int status=ed.saveForm(emi);
				if(status==1)
				{
					request.getRequestDispatcher("emiTableForm.jsp").forward(request, response);
				}
				else
				{
					pw.println(" <center><br><br><br><br><br><br><br><br> <span style=color:red;font-size:10px;>Invalid User ID (or)\r\n" + 
							"Incorrect Password</span></br></br></br></br></br></br></br></br></center>");
					request.getRequestDispatcher("emiTableForm.jsp").include(request, response);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		
	}

}
