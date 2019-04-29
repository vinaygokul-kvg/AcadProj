<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank Admin</title>
</head>
<body>

	<center>
		<pre>
		<a href="ShowLoan.do">Show All Customer Loan Details</a><br>
		<a href="AddLoan.jsp">Add Loans</a><br>
		<a href="emiTableForm.jsp">Pay EMI</a><br>
		<a href="ShowLoan.do">Charge Back Calculation</a><br>
		<a href="ShowAllCBC.do">Charge Back Details</a><br>
		</pre>
	</center>
	
</body>
</html>


 -->



<!DOCTYPE html>
<!-- Template by Quackit.com -->
<!-- Images by various sources under the Creative Commons CC0 license and/or the Creative Commons Zero license. 
Although you can use them, for a more unique website, replace these images with your own. -->
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

   <title>Insert title here</title>

   
    <link href="css/bootstrap.min.css" rel="stylesheet">

    
    <link href="css/custom2.css" rel="stylesheet">

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    
</head>

<body>

    <!-- Navigation -->
    <nav id="siteNav" class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Logo and responsive toggle -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">
                	<span class="glyphicon glyphicon-fire"></span> 
                	MVHN Bank
                </a>
            </div>
            <!-- Navbar links -->
            <div class="collapse navbar-collapse" id="navbar">
                <ul class="nav navbar-nav navbar-right">
                   
                </ul>
                
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container -->
    </nav>

	<!-- Header -->
    <header>
        <div class="header-content">
            <div class="header-content-inner">
               <a href="ShowLoan.do?val=1" class="btn btn-primary btn-lg">Show All Customer Loan Details</a><br><br>
				<a href="AddLoan.jsp" class="btn btn-primary btn-lg">Add Loans</a><br><br>
				<a href="emiTableForm.jsp" class="btn btn-primary btn-lg">Pay EMI</a><br><br>
				<a href="ShowLoan.do?val=2 " class="btn btn-primary btn-lg">Charge Back Calculation</a><br><br>
				<a href="ShowAllCBC.do" class="btn btn-primary btn-lg">Charge Back Details</a><br><br>
                <!-- <a href="#" class="btn btn-primary btn-lg">Customer Login</a>
				<a href="index.jsp" class="btn btn-primary btn-lg">Bank Admin Login</a> -->
            </div>
        </div>
    </header>

</body>

</html>
