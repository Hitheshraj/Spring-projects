<%@ page language="java" contentType="text/html" isELIgnored="false"%>
<html>
<head>
<title>Hello World</title>
<body>
<h1>Hello! Welcome to Spring MVC</h1>
<%
out.println("id:"+request.getAttribute("id")+"<br/>");
out.println("id:"+request.getAttribute("name")+"<br/>");
out.println("id:"+request.getAttribute("salary")+"<br/>");
%>
<p>ID:${id}</p>
<p>ID:${name}</p>
<p>ID:${salary}</p>
<p>${employee}</p>
</body>
</head>
</html>