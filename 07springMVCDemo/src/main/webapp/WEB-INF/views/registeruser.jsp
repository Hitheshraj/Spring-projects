<%@ page language="java" contentType="text/html" isELIgnored="false"%>
<html>
<head>
<title>Register</title>
<body>
	<h1>User Registration</h1>
	<form action="signupuser2" method="post"><!-- signupuser for post,signupuser2 for get -->
		<pre>
		ID:<input type="text" name="id" /><br> 
		Name:<input type="text" name="name" /> <br>
		Email:<input type ="text" name="email" /> 
		<input type="submit" name="SignUp" />
		</pre>
	</form>
</body>
</head>
</html>