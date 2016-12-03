<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<p> <a href="${pageContext.request.contextPath}/offers"> show current offers </a>
<p> <a href="${pageContext.request.contextPath}/createoffer"> Add a new offer </a>
<br/>
<p> <a href="${pageContext.request.contextPath}/creditsfromsemester">학기별 이수 학점 조회</a>
<p> <a href="${pageContext.request.contextPath}/creditsfromclasstype">이수 구분별 학점 조회</a>
<p> <a href="${pageContext.request.contextPath}/enroll">수강 신청하기</a>
<p> <a href="${pageContext.request.contextPath}/showenroll">수강 신청 조회</a>
</body>
</html>
