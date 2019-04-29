<%@page import="com.cbc.model.pojo.ChargeBack"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Charge Back Details</title>
<link rel="stylesheet" href="css/formstyle.css" media="screen" type="text/css" />
</head>
<body>

<div class="bg">
		<br><br><br><br><br>
		<center><h1 style = "color : grey ; font-size : 30px;">Charge Back Details</h1></center>
		<br><br><br><br><br><br>
	<center>	
	<table style = "align :center ; height:80px; width:700px; background-color :#DEE876; border-style:solid;border-color:black; border-width: 2px;">
		<tr style = "width:100px; border-style: solid;border-color: grey; border-width: 2px;">
			<th  style = "width:100px; border-style: solid;border-color: grey; border-width: 2px;">Account Number </th>
			<th style = "width:100px; border-style: solid;border-color: grey; border-width: 2px;">Customer Name</th>
			<th style = "width:100px; border-style: solid;border-color: grey; border-width: 2px;">Charge Back Date</th>
			<th style = "width:100px; border-style: solid;border-color: grey; border-width: 2px;">Charge Back Amount</th>
			<th style = "width:100px; border-style: solid;border-color: grey; border-width: 2px;">Reason</th>			
		</tr>
		<%
			List<ChargeBack> cbc_list=(List) request.getAttribute("cbclist");		
			for(ChargeBack cbc:cbc_list)
			{				
				%>
				<tr style = " text-align :center; width:100px; border-style: solid;border-color: grey; border-width: 2px;" >					
					<td  style = "width:100px; border-style: solid;border-color: grey; border-width: 2px;"><a style = "color:brown;" href="IndividualCbcDetails?accno=<%=cbc.getAccountNumber() %>"><%=cbc.getAccountNumber() %></a></td>
					<td style = "width:100px; border-style: solid;border-color: grey; border-width: 2px;"><%=cbc.getCustomerName() %></td>
					<td style = "width:100px; border-style: solid;border-color: grey; border-width: 2px;"><%=cbc.getChargebackDate() %></td>
					<td style = "width:100px; border-style: solid;border-color: grey; border-width: 2px;"><%=cbc.getChargebackAmount() %></td>
					<td style = "width:100px; border-style: solid;border-color: grey; border-width: 2px;"><%=cbc.getReason() %></td>									
				</tr>
				<%
			}
		%>
		</table>
</center>

</body>
</html>