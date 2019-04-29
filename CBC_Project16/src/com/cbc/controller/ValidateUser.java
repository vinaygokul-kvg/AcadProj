package com.cbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cbc.model.bo.FormDAO;
import com.cbc.model.bo.FormDAOImpl;
import com.cbc.model.pojo.BankUser;

/**
 * Servlet implementation class ValidateUser
 */
@WebServlet("/ValidateUser.do")
public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateUser() {
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
		String username=request.getParameter("Username");
		String password=request.getParameter("Password");				
		FormDAO fd=new FormDAOImpl();
		int status=fd.validateUser(username, password);
		javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		if(status==1)
		{
			request.getRequestDispatcher("UserHome.jsp").forward(request, response);
			
		}
		else
		{
			pw.println(" <center><br><br><br><br><br><br><br><br> <span style=color:red;font-size:10px;>Invalid User ID (or)\r\n" + 
					"Incorrect Password</span></br></br></br></br></br></br></br></br></center>");
			rd.include(request, response);
		}
	}

}
