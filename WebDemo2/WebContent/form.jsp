<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>
<body><form action="register" method="get">
<table>
<tr>
<td>username</td>
<td><input type="text"name="username"required/></td>
</tr>
<tr>
<td>password</td>
<td><input type="text"name="password"required/></td>
</tr>
<tr>
<td>customername</td>
<td><input type="text"name="cname"required></td>
</tr>
<tr>
<td>gender</td>
<td><input type="radio" name="gender"value="M"required/>male</td>
<td><input type="radio" name="gender"value="F"required/>female</td>
</tr>
<tr>
<td>customer address</td>
<td><textarea cols="20" rows="5" name="address"></textarea></td>

</tr>
<tr>
<td colspan="2"align="center">
<input type="submit" name="submit"value="register"/>
</td>
</tr>
</table>


</form>

</body>
</html>