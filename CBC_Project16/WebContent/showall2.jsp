<%@page import="com.cbc.model.pojo.Loan"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Charge Back Details</title>
</head>
<body>
		<table align="center" border=1>
		<tr>
			<td>Loan ID</td><td>Account Number</td><td>Customer Name</td><td>Loan Amount</td><td>Interest Rate</td><td>No of Years</td>
			<td>Emi Amount</td><td>Sanction Date</td>
		</tr>
		<%
			List<Loan> list=(List)request.getAttribute("loanlist");
			for(Loan l:list)
			{				
				%>
				<tr>
					<%-- <td><a href="ShowIndCusDetails?accno=<%=accno %>&"><%=accno %></td> --%>
					<td><a href="IndividualCustomerDetails?loanid=<%=l.getLoadId() %>"><%=l.getLoadId() %></a></td>
					<td><%=l.getAccountNumber() %></td>
					<td><%=l.getCustomer_name() %></td>
					<td><%=l.getLoanAmount() %></td>
					<td><%=l.getInterestRate() %></td>
					<td><%=l.getNoOfYears() %></td>
					<td><%=l.getEmiAmount() %></td>
					<td><%=l.getSanctionDate() %></td>					
				</tr>
				<%
			}
		%>
		</table>
</body>
</html>