<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
 <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">
<title>Insert title here</title>
</head>
<body>
<div class="container">

      <div id="login">

        <form action="ValidateUser.do" method="post">

          <fieldset class="clearfix">

            <p><span class="fontawesome-user"></span><input type="text" name="Username" value="Username" onBlur="if(this.value == '') this.value = 'Username'" onFocus="if(this.value == 'Username') this.value = ''" required></p> <!-- JS because of IE support; better: placeholder="Username" -->
            <p><span class="fontawesome-lock"></span><input type="password" name="Password" value="Password" onBlur="if(this.value == '') this.value = 'Password'" onFocus="if(this.value == 'Password') this.value = ''" required></p> <!-- JS because of IE support; better: placeholder="Password" -->
            <p><input type="submit" value="Sign In"></p>

          </fieldset>

        </form>

        <p>Not a member? <a href="UserRegistration.jsp">Sign up now</a><span class="fontawesome-arrow-right"></span></p>
        <br><br>
        
        <center><a href="#"></a><br>
		<a href="#"></a></center>
      </div> <!-- end login -->

    </div>
</body>
</html>