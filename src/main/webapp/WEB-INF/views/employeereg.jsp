<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee reg</title>
</head>
<body>
	<div align="center">
		<h1>Employee Register Form</h1>
		<form action="<%= request.getContextPath() %>/register" method="post">
			<table style="width:80%;">
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"/>
				</tr>
				<tr>
					<td>Username:</td>
					<td><input type="text" name="username"/>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"/>
				</tr>
				<tr>
					<td>Note:</td>
					<td><input type="text" name="note"/>
				</tr>
			</table>
			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>