<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>
			EMI Form	
		</title>
		<meta charset="UTF-8">
		
		<link rel="stylesheet" href="css/formstyle.css" media="screen" type="text/css" />
	</head>
	<body >
    <div class="container">
	<div id="login">
	<form action="GetDueDate.do" method="post" name="form">
	<fieldset class="clearfix">
			
			
			<h1 style = "text-size : 450x;color: #D5BA67;">Loan ID:</h1><br>
			<h2><input type="text" name="loanid" id="loanid" value=""required  oninvalid="this.setCustomValidity('Enter Loan ID Here')" oninput="this.setCustomValidity('')"  /><br><br></td>
			</h2>
			<h2>
			<button type="submit"  value="Submit" >Submit</button>
			</h2>
						
		
		
		
		</fieldset>
		</form>
		</div>
		</div>
	</body>	
</html>