<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Connecter-vous</h1>
<p> <font color="red">${error }</font></p>
  <form action="/login.do" method="post">
Username : <input type="text" name="uname">
Password : <input type="password" name="password">

<input type="submit" >


  </form>

</body>
</html>