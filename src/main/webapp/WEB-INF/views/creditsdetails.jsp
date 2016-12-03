<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>학기별상세조회</title>
</head>
<body>
	학기별 상세조회

	<table>
		<tr>
			<th>수강년도</th>
			<th>학기</th>
			<th>과목코드</th>
			<th>교과목명</th>
			<th>구분</th>
			<th>학점</th>
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