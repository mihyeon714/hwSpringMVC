<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form method="get" action="${pageContext.request.contextPath}/docreate">
	<table class="formtable">
		<tr>
			<td class="label">Name:</td>
			<td><input class="control" name="name" type="text" /></td>
		</tr>

		<tr>
			<td class="label">Email:</td>
			<td><input class="control" name="email" type="text" /></td>
		</tr>

		<tr>
			<td class="label">Text:</td>
			<td><textarea class="control" name="text" rows="10" dols="10"></textarea></td>
		</tr>
		<tr>
			<td></td>
			<td><input class="control" value="Create Offer" type="submit" /></td>
		</tr>
	</table>
	</form>

</body>
</html>
