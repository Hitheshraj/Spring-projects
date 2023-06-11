<%@ page language="java" contentType="text/html" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Register</title>
<body>
	<h1>Manage Products</h1>
	<form action="products" method="post">
		<pre>
		Name:<input type="text" name="name" /> <br>
		Description:<input type ="text" name="desc" /> 
		Price:<input type ="text" name="price" /> 
		<input type="submit" name="SignUp" />
		</pre>
	</form>
	<p>${message}</p>
	<ul>
	<c:forEach items="${products}" var="product">
	<table>
	<tr>ID|NAME|DESC|PRICE</tr>
	<td>${product.id} | ${product.name} | ${product.desc} | ${product.price}</td>
	</table>
	</c:forEach>
	</ul>
</body>
</head>
</html>