<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>학점조회_이수구분별</title>
</head>
<body>
	<h2>이수 구분별 학점</h2>
	<table>
		<tr>
			<c:forEach var="credit" items="${credits}">
				<td>${credit.classtype}</td>
			</c:forEach>
			<td>총학점</td>
		</tr>

		<tr>
			<c:forEach var="credit" items="${credits}">
				<td>${credit.credits}</td>
				<c:set var="sum" value="${sum + credit.credits}" />
			</c:forEach>
			<td><c:out value="${sum}" /></td>
		</tr>
	</table>


</body>
</html>