<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>������ȸ_�б⺰</title>
</head>
<body>
	�б⺰
	<table>
		<tr>
			<th>�⵵</th>
			<th>�б�</th>
			<th>�̼�����</th>
			<th>�󼼺���</th>
		</tr>
		<c:forEach var="credits" items="${credits}">
			<c:set var="year" value="${credits.year}" />
			<c:set var="semester" value="${credits.semester}" />
			<c:set var="credit" value="${credits.credits}" />
			<tr>
				<td><c:out value="${year}" /></td>
				<td><c:out value="${semester}" /></td>
				<td><c:out value="${creditssum}" /></td>
				<td> <a href="${pageContext.request.contextPath}/creditsdetails?year=${year}&semester=${semester}">Ŭ��</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>