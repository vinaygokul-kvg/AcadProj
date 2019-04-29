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
	<form action="AddEMI.do" method="post" name="form">
	<fieldset class="clearfix">
	<table style="width:450px" id="formfield">
						
			
			<%
				ArrayList ar=(ArrayList)request.getAttribute("allow");
				if(ar!=null)
				{
					int loadid=0;
					String dueDate=null;
					Iterator it=ar.iterator();
					Object obj[]=new Object[2];
					int i=0;
					while(it.hasNext()){
						
						obj[i]=it.next();
						i++;
					}
						
					
			%>
			<tr>
			<td >Loan ID:</td>
			<td><input type="text" name="loanid" id="loanid" value="<%=obj[1].toString() %>" required  oninvalid="this.setCustomValidity('Enter Loan ID Here')" oninput="this.setCustomValidity('')"  /><br><br></td>
			</tr>
			<tr>
			<td>Due Date:</td>
			<td><input type="text" name="duedate" id=""duedate"" value="<%=obj[0].toString() %>" required oninvalid="this.setCustomValidity('Enter Due Date Here')" oninput="this.setCustomValidity('')" /><br><br></td>
			</tr>
			
			<tr>
			<td>Paid Date:</td>
			<td><input type="date" name="paiddate" id="paiddate" value="" required oninvalid="this.setCustomValidity('Enter Paid Date Here')" oninput="this.setCustomValidity('')"/><br><br></td>
			</tr>
			<tr>
			<td><button type="submit"  value="Submit" >Submit</td></button>
			</tr>
			<%
				}
			%>
		</table>
		
		
		</fieldset>
		</form>
		</div>
		</div>
	</body>	
</html>