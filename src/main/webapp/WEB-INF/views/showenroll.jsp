<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>수강 신청 조회</title>
</head>
<body>
	<h2>2017년 1학기 수강신청 조회</h2>
	<table class="formtable">
		<tr>
			<th>교과코드</th>
			<th>교과목명</th>
			<th>구분</th>
			<th>학점</th>
		</tr>
		<c:forEach var="credits" items="${credits}">
			<c:set var="classcode" value="${credits.classcode}" />
			<c:set var="classname" value="${credits.classname}" />
			<c:set var="classtype" value="${credits.classtype}" />
			<c:set var="credit" value="${credits.credits}" />
			<tr>
				<td><c:out value="${classcode}" /></td>
				<td><c:out value="${classname}" /></td>
				<td><c:out value="${classtype}" /></td>
				<td><c:out value="${credit}" /></td>
			</tr>
		</c:forEach>

		<tr style = "text-align:right">
			<td colspan="3">총 신청 학점</td>
			<td >몇점!</td>
		</tr>
	</table>
</body>
</html>