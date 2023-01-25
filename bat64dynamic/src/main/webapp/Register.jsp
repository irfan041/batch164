<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
	<form action="RegisterServlet" method="post">
		ID<input type="text" name="id" /><br /> Name<input type="text"
			name="ename" /><br /> Salary<input type="text" name="esalary" /><br />
		Address<input type="text" name="eaddress" /><br /> MobileNo<input
			type="text" name="mbl" /><br /> <input type="submit"
			value="Register" />

	</form>
</body>
</html>