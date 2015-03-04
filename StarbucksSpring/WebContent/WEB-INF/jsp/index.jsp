<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Starbucks</title>
</head>
<body>
<body>
<h2>Ask for advice about your favorite roast:</h2>
<p />

<form action ="authenticate" method="get">
<select name="roast" ${userValid ? "" : "disabled"}>
  <option value="dark">Dark</option>
  <option value="medium">Medium</option>
  <option value="light">Light</option>
</select>
<br/><br/>
<input type="submit" value = "Submit" ${userValid ?  "" : "disabled"}/>
</form>

<p />
Login:
<form action = "authenticate" method = "post">
Name: <input type = "text" name = "name2" size = "9" /><br/>
Password: <input type = "password" name = "password" size = "9" /><br/>
<br/>
<input type="submit" value = "Log In"/>
</form>

</body>
</html>