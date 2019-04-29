<%@page import="com.cbc.model.pojo.ChargeBack"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Chargeback Updation Form</title>
		<meta charset="UTF-8">
		
		<link rel="stylesheet" href="css/formstyle.css" media="screen" type="text/css" />
	</head>
	<body >
    <div class="container">
	<div id="login">
	<form action="RefundCbc.do" method="post" name="form">
	<fieldset class="clearfix">
	<table style="width:400px">
			<%
				ChargeBack cbc=(ChargeBack) session.getAttribute("cbcdetails");
				
			
			%>
		
			<tr>
			<td>Account Number :</td>
			<td><input type="text" name="accnum" id="accnum" value="<%=cbc.getAccountNumber() %>" required oninvalid="this.setCustomValidity('Enter Account Number Here')" oninput="this.setCustomValidity('')"/><br><br></td>
			</tr>
			
			<tr>
			<td>Customer Name :</td>
			<td><input type="text" name="cusname" id="cusname" value="<%=cbc.getCustomerName() %>" required oninvalid="this.setCustomValidity('Enter Customer Name Here')" oninput="this.setCustomValidity('')" /><br><br></td>
			</tr>
			
			<tr>
			<td>Charge Back Date :</td>
			<td><input type="text" name="cbdate" id="cbdate" value="<%=cbc.getChargebackDate() %>" required  oninvalid="this.setCustomValidity('Enter Charge Back Date Here')" oninput="this.setCustomValidity('')"/><br><br></td>
			</tr>
			
			<tr>
			<td >New Chargeback Amount :</td>
			<td><input type="text" name="newchargebackamt" id="newchargebackamt" value="<%=cbc.getChargebackAmount() %>" required  oninvalid="this.setCustomValidity('Enter Charge Back Amount Here')" oninput="this.setCustomValidity('')"  /><br><br></td>
			</tr>
			
			<tr>
			<td>Reason :</td>
			<td><input type="text" name="reason" id="reason" value="<%=cbc.getReason() %>" required oninvalid="this.setCustomValidity('Enter Reason Here')" oninput="this.setCustomValidity('')"/><br><br></td>
			</tr>
			
			<tr>
			<td>Refund Status :</td>
			<td><input type="text" name="refund_status" id="refund_status" value="" required oninvalid="this.setCustomValidity('Enter Reason Here')" oninput="this.setCustomValidity('')"/><br><br></td>
			</tr>
			
			<tr>
			<td>Refund Amount :</td>
			<td><input type="text" name="refund_amount" id="refund_amount" value="" required oninvalid="this.setCustomValidity('Enter Reason Here')" oninput="this.setCustomValidity('')"/><br><br></td>
			</tr>
			
			<tr>
			<td>Comments :</td>
			<td><input type="text" name="Comments" id="Comments" value="" required oninvalid="this.setCustomValidity('Enter Reason Here')" oninput="this.setCustomValidity('')"/><br><br></td>
			</tr>					
		</table>
		
		<button type="submit" form="form" value="Refund Update" ><p>Refund Update</p></button>
		</fieldset>
		</form>
		</div>
		</div>
	</body>	
</html>