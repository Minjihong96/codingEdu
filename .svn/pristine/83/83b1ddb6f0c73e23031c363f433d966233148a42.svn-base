<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<fmt:requestEncoding value="UTF-8" />

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>상담 신청</title>
  <link rel="stylesheet" href="${path}/com/bootstrap.min.css">
  <link rel="stylesheet" href="assets/css/theme.css">
  <link rel="apple-touch-icon" sizes="180x180" href="assets/img/favicons/apple-touch-icon.png">
  <link rel="icon" type="image/png" sizes="32x32" href="assets/img/favicons/favicon-32x32.png">
  <link rel="icon" type="image/png" sizes="16x16" href="assets/img/favicons/favicon-16x16.png">
  <link rel="shortcut icon" href="assets/img/favicons/favicon.ico">
  <meta name="theme-color" content="#ffffff">
  <style>
    td { text-align: center; }
    .valid-msg { font-size: 0.9rem; color: green; }
    .error-msg { font-size: 0.9rem; color: red; }
  </style>
</head>
<body>
<div class="jumbotron text-center">
  	<h2>사원정보리스트</h2>
	<h2>데이터 건수:${crList.size()}</h2>
</div>
<div class="container">
	<form id="frm01" class="form"> <%-- post 요청 body ename=@@&job=@@ --%>
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input placeholder="사원명" name="name" value=""  class="form-control mr-sm-2" />
	    <button class="btn btn-info" type="submit">Search</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
   <table class="table table-hover table-striped">
    <col width="15%">
    <col width="15%">
    <col width="15%">
    <col width="15%">
    <col width="25%">
    <col width="15%">
    <thead>
        <tr class="table-success text-center">
            <th>이름</th>
            <th>전화번호</th>
            <th>상담시간</th>
            <th>부서</th>
            <th>메시지</th>
            <th>등록일</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="c" items="${crList}">
            <tr>
                <td>${c.name}</td>
                <td>${c.phone}</td>
                <td>${c.counselingTime}</td>
                <td>${c.department}</td>
                <td>${c.message}F</td>               
            </tr>
        </c:forEach>
    </tbody>
</table>       
</div>
<link href="https://fonts.googleapis.com/css2?family=DM+Serif+Display&family=Rubik:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">
</body>
</html>