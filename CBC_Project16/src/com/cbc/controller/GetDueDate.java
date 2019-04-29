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
@WebServlet("/GetDueDate.do")
public class GetDueDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDueDate() {
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
			EmiDAO ed=new EmiDAOImpl();
			java.sql.Date dueD=ed.calculateDueDate(loanid);
			System.out.println(dueD);
			Calendar c=Calendar.getInstance();
			c.setTime(dueD);
			c.add(Calendar.MONTH, 1);
			Date dd=c.getTime();	
			SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd");
			String dueStr=sd1.format(dd);
			ArrayList ar=new ArrayList();
			ar.add(dueStr);
			ar.add(loanid);
			if(dueD!=null)
			{
				request.setAttribute("allow", ar);
				request.getRequestDispatcher("emiTableForm2.jsp").forward(request, response);
				
			}
			else
			{
				pw.println(" <center><br><br><br><br><br><br><br><br> <span style=color:red;font-size:10px;>Loan ID Not Found</span></br></br></br></br></br></br></br></br></center>");
				request.getRequestDispatcher("emiTableForm.jsp").include(request, response);
			}					
	}

}
