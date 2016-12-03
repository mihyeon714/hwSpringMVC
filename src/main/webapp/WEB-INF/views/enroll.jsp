<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>수강신청</title>
</head>
<body>
	<h2>2017년도 수강신청</h2>
	<form method="get" action="${pageContext.request.contextPath}/doenroll">
		<table class="formtable">
			<tr>
				<td class="label">ClassName:</td>
				<td><input class="control" name="classname" type="text" /></td>
			</tr>

			<tr>
				<td class="label">ClassCode:</td>
				<td><input class="control" name="classcode" type="text" /></td>
			</tr>

			<tr>
				<td class="label">ClassType:</td>
				<td><input class="control" name="classtype" type="text" /></td>
			</tr>

			<tr>
				<td class="label">Credits:</td>
				<td><input class="control" name="credits" type="text" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input class="control" value="Enroll" type="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>