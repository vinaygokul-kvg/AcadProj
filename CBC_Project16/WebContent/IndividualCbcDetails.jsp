<%@page import="com.cbc.model.pojo.ChargeBack"%>
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
<title>Customer Details</title>
       <link rel="stylesheet" href="css/formstyle.css" media="screen" type="text/css" />
</head>
<body>
	<div class="bg">
		<br><br><br><br><br>
			<center><h1 style = "color : grey ; font-size : 30px;">Customers Details</h1></center>
		<br><br><br><br><br><br>
		<table align="center" border=2 height="300" width="1000" bgcolor="#DEE876">
			
			<%
				ChargeBack cbc=(ChargeBack) session.getAttribute("cbcdetails");
				
			
			%>
			<tr>
				<td> Account Number :</td>
				<td><%=cbc.getAccountNumber() %></a></td>
			</tr>
			
			<tr>
				<td> Customer Name :</td>
				<td><%=cbc.getCustomerName() %></td>
			</tr>
			
			
				
			<tr>
			<td> Charge Back Date :</td>
				<td><%=cbc.getChargebackDate() %> </td>
			</tr>
			
			
			
			<tr>
				<td> Charge Back Amount :</td>
					<td><%=cbc.getChargebackAmount() %> </td>
			</tr>
			
			
			<tr>
				<td> Reason :</td>
					<td><%=cbc.getReason() %> </td>
			</tr>		
			
			<tr>
				<td><a style = "color:brown;" href="cbcstatusupdate.jsp?accno=<%=cbc.getAccountNumber() %>">Update</td>
				<td><a style = "color:brown;" href="cbcrefund.jsp?accno=<%=cbc.getAccountNumber() %>">Refund</td>
			</tr>						
			
	</table>

</body>
</html>