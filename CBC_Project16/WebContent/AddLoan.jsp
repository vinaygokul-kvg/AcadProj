<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>
			Add Loan	
		</title>
		<meta charset="UTF-8">
		
		<link rel="stylesheet" href="css/formstyle.css" media="screen" type="text/css" />
	</head>
	<body >
    <div class="container">
	<div id="login">
	<form action="AddLoan.do" method="post" name="form">
	<fieldset class="clearfix">
	<table style="width:400px" id="formfield">
			
			<tr>
			<td >Account Number:</td>
			<td><input type="text" name="accno" id="accno" value=""required  oninvalid="this.setCustomValidity('Enter First Name Here')" oninput="this.setCustomValidity('')"  /><br><br></td>
			</tr>
			
			<tr>
			<td>Customer Name:</td>
			<td><input type="text" name="custname" id="custname" value=""required oninvalid="this.setCustomValidity('Enter Last Name Here')" oninput="this.setCustomValidity('')" /><br><br></td>
			</tr>
			
			<tr>
			<td>Loan Amount:</td>
			<td><input type="text" name="loanamount" id="loanamount" value=""required oninvalid="this.setCustomValidity('Enter Age Here')" oninput="this.setCustomValidity('')"/><br><br></td>
			</tr>
									
			<tr>
			<td>Interest Rate:</td>
			<td><input type="text" name="irate" id="irate" value=""/><br><br></td>
			</tr>
			
			<tr>
			<td>No of years:</td>
			<td><input type="text" name="noofyears" id="noofyears" value=""required on invalid="this.setCustomValidity('Enter City Here')" oninput="this.setCustomValidity('')"/><br><br></td>
			</tr>
													
		</table>
		
		<button type="submit" form="form" value="Submit" ><p>Submit</p></button>
		</fieldset>
		</form>
		</div>
		</div>
	</body>	
</html>