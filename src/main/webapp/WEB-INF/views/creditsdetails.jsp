<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�б⺰����ȸ</title>
</head>
<body>
	�б⺰ ����ȸ

	<table>
		<tr>
			<th>�����⵵</th>
			<th>�б�</th>
			<th>�����ڵ�</th>
			<th>�������</th>
			<th>����</th>
			<th>����</th>
		</tr>
		<c:forEach var="credits" items="${credits}">
			<tr>
				<td><c:out value="${credits.year}" /></td>
				<td><c:out value="${credits.semester}" /></td>
				<td><c:out value="${credits.classcode}" /></td>
				<td><c:out value="${credits.classname}" /></td>
				<td><c:out value="${credits.classtype}" /></td>
				<td><c:out value="${credits.credits}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>