<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register.do" method="POST">
	Username: <input type="text" name="username"><br>
	Password: <input type="text" name="password"><br>
	First Name: <input type="text" name="first_name"><br>
	Last Name: <input type="text" name="last_name"><br>
	Email: <input type="text" name="email"><br>
	Address: <input type="text" name="address"><br>
	Phone: <input type="text" name="phone"><br>
	<button type="submit">Submit</button>
</form>
</body>
</html>