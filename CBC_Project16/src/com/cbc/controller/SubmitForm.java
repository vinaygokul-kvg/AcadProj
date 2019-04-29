package com.cbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cbc.model.bo.FormDAO;
import com.cbc.model.bo.FormDAOImpl;
import com.cbc.model.pojo.BankUser;


/**
 * Servlet implementation class SubmitForm
 */
@WebServlet("/SubmitForm.do")
public class SubmitForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubmitForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String contactnumber=request.getParameter("contactnumber");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		BankUser fm=new BankUser(firstname, lastname, age, gender, contactnumber, city, state, userid, password);
		FormDAO fmdao=new FormDAOImpl();
		int status=fmdao.saveForm(fm);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		if(status==1)
		{
			pw.println("<span style=color:green;font-size:20px;>New user created Successfully</span>");
			rd.include(request, response);
		}
		else
		{
			pw.println("<span style=color:red;size:20px>Failed Adding Customer</span>");
			rd.include(request, response);
		}
		
	}

}
