<%@page import="com.cbc.model.pojo.ChargeBack"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<%
			ChargeBack cbc = (ChargeBack) request.getAttribute("cbc");
			if(cbc!=null){
		%>
	<table align="center" border=1>
		<tr>
			<td>Account Number :</td>
			<td><%=cbc.getAccountNumber()%></a></td>
		</tr>

		<tr>
			<td>Customer Name :</td>
			<td><%=cbc.getCustomerName()%></td>
		</tr>

		<tr>
			<td>Charge Back Amount :</td>
			<td><%=cbc.getChargebackAmount()%></td>
		</tr>

		<tr>
			<td>Charge Back Date :</td>
			<td><%=cbc.getChargebackDate()%></td>
		</tr>

		<tr>
			<td>Reason :</td>
			<td><%=cbc.getReason()%></td>
		</tr>

	</table>
	<% }%>
	

</body>
</html>