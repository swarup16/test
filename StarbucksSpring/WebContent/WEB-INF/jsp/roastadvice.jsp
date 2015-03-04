<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/style.css">
<title>Roast Advice</title>
<style>@import url(css1/foo/style.css);</style>
</head>
<body>
<p>Hey ${Username}, Starbuck's ${roastDetails.roastChoice} Roast Coffees:</p>
<table>
<c:forEach var="roasttype" items="${roastDetails.roastAdvice}">
		<tr><td>${roasttype}</td></tr>
</c:forEach>
</table>
<br>
<form action="roastselection" method="get">
<input type="submit" value="Back">
</form>
<form action ="logout" method="get">
<input type="submit" value = "Logout"/>
</form>
</body>
</html>