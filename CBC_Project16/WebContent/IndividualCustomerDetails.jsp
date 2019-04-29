<%@page import="com.cbc.model.pojo.Loan"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/tablepage.css"/>
</head>
<body>
<div class="bg">
		<br><br><br><br><br>
		<center><h1 >Individual Customer Details</h1></center>
		<br><br><br><br><br><br>
		<table align="center" border=2 height="300" width="1000" bgcolor="#DEE876">
	
			
			<%
				Loan l=(Loan) request.getAttribute("customerdetails");
				int val=(int)session.getAttribute("val");
				System.out.print("Val : "+val);
			%>
			<tr>
				<td> Loan ID :</td>
				<%
				if(val==2)
				{
				%>
				<td><a href="ChargeBackCal.do?loanid=<%=l.getLoadId() %>"><%=l.getLoadId() %></a></td>
				<%
				}else if(val==1){
					%>
					<td><%=l.getLoadId() %></td>
					<%
				}
				%>
			</tr>
			
			<tr>
				<td> Account Number :</td>
				<td><%=l.getAccountNumber() %></td>
			</tr>
			
			
				
			<tr>
			<td> Customer Name :</td>
				<td><%=l.getCustomer_name() %> </td>
			</tr>
			
			
			
			<tr>
				<td> Loan Amount :</td>
					<td><%=l.getLoanAmount() %> </td>
			</tr>
			
			
			<tr>
				<td> Interest Rate :</td>
					<td><%=l.getInterestRate() %> </td>
			</tr>
			
			
			<tr>
				<td> No of Years :</td>
					<td><%=l.getNoOfYears() %> </td>
			</tr>
			<tr>
				<td> Emi Amount :</td>
					<td><%=l.getEmiAmount() %> </td>
			</tr>
			<tr>
				<td> Sancation Date :</td>
					<td><%=l.getSanctionDate() %> </td>
			</tr>
			
	</table>

</body>
</html>