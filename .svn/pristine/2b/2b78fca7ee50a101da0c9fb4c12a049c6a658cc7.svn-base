<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="UTF-8"/>
<!DOCTYPE html>
<%--


 --%>
<html>
<head>
  <meta charset="UTF-8">
  <title>수업 기록 수정</title>
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
   
    .form-control {
    width: 60%;  /* 원하는 비율로 너비 설정 */ 	 
	}
	#editForm{padding-left:100px; padding-bottom:40px;}
  </style>
</head>
<body>

    <main class="main" id="top">

      <section class="bg-primary py-2 d-none d-sm-block">

        <div class="container">
          <div class="row align-items-center">
            <div class="col-auto d-none d-lg-block">
              <p class="my-2 fs--1"><i class="fas fa-map-marker-alt me-3"></i><span>1600 Amphitheatre Parkway, CA 94043 </span></p>
            </div>
            <div class="col-auto ms-md-auto order-md-2 d-none d-sm-block">
              <ul class="list-unstyled list-inline my-2">
                <li class="list-inline-item">
              		<c:if test="${not empty sessionScope.loginUser}">
	  					<p class="my-2 fs--1">
	   						환영합니다!! <strong>${sessionScope.loginUser.memName}</strong>님
	  					</p>
					</c:if>
              	</li>
                <li class="list-inline-item"><a class="text-decoration-none" href="#!"><i class="fab fa-facebook-f text-900"></i></a></li>
                <li class="list-inline-item"><a class="text-decoration-none" href="#!"><i class="fab fa-pinterest text-900"></i></a></li>
                <li class="list-inline-item"><a class="text-decoration-none" href="#!"><i class="fab fa-twitter text-900"></i></a></li>
                <li class="list-inline-item"><a class="text-decoration-none" href="#!"><i class="fab fa-instagram text-900"> </i></a></li>
              </ul>
            </div>
            <div class="col-auto">
              <p class="my-2 fs--1"><i class="fas fa-envelope me-3"></i><a class="text-900" href="mailto:vctung@outlook.com">vctung@outlook.com </a></p>
            </div>
          </div>
        </div>

      </section>

      <nav class="navbar navbar-expand-lg navbar-light sticky-top py-3 d-block" data-navbar-on-scroll="data-navbar-on-scroll">
        <div class="container"><a class="navbar-brand" href="${pageContext.request.contextPath}/pteamain"><img src="assets/img/gallery/logo-n.png"  height="45" alt="logo" /></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"> </span></button>
          <div class="collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto pt-2 pt-lg-0 font-base">
              <li class="nav-item px-2"><a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/pmaterialList">강의 목록</a></li>
 			  <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/ptcrList">무료신청확인</a></li>
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/pclassRecordInsert">수업기록작성</a></li>
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/pclassRecordList">수업기록리스트</a></li>
            </ul>
            <c:choose>
            	<c:when test="${not empty sessionScope.loginUser}">
            		<a class="btn btn-primary order-1 order-lg-0" href="${pageContext.request.contextPath}/plogout.do">Logout</a>
            	</c:when>
            	<c:otherwise>
            		<a class="btn btn-primary order-1 order-lg-0" href="${pageContext.request.contextPath}/plogin">Login</a>
            	</c:otherwise>
            </c:choose>
            <form class="d-flex my-3 d-block d-lg-none">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
              <button class="btn btn-outline-primary" type="submit">Search</button>
            </form>
            <div class="dropdown d-none d-lg-block">
              <button class="btn btn-outline-light ms-2" id="dropdownMenuButton1" type="submit" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-search text-800"></i></button>
              <ul class="dropdown-menu dropdown-menu-lg-end" aria-labelledby="dropdownMenuButton1" style="top:55px">
                <form>
                  <input class="form-control" type="search" placeholder="Search" aria-label="Search" />
                </form>
              </ul>
            </div>
          </div>
        </div>
      </nav>

  <div id = "editForm" class="container mt-5">
    <h3 class="mb-4 font-sans-serif">수업 기록 수정</h3>

    <form:form method="post" action="${path}/classRecord/edit" modelAttribute="classRecord" class="form">

        <form:hidden path="recordId" />

        <div class="mb-3">
            <label class="form-label">학생명</label>
            <form:input path="memPrid" class="form-control" />
        </div>

        <div class="mb-3">
            <label class="form-label">수업 날짜</label>
            <form:input path="classDate" type="date" class="form-control" />
        </div>

        <div class="mb-3">
            <label class="form-label">수업 내용</label>
            <form:input path="classContents" class="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">과제</label>
            <form:input path="subject" class="form-control" />
        </div>

        <div class="mb-3">
            <label class="form-label">잔여 수업 회차</label>
            <form:input path="sessionNumber" type="number" class="form-control" />
        </div>

        <div class="mb-3">
            <label class="form-label">결제</label>
            <form:input path="payment" class="form-control" />
        </div>

        <div class="mb-3">
            <label class="form-label">기타</label>
            <form:textarea path="etc" class="form-control" rows="3" />
        </div>

        <button type="submit" class="btn btn-success">수정 완료</button>
        <a href="${path}/classRecord/list" class="btn btn-secondary">취소</a>
    </form:form>
  </div>

  <%-- 하단 푸터는 그대로 유지 --%>
  <section class="bg-secondary">
    <div class="container"><!-- footer 내용 그대로 --></div>
  </section>
</main>

<script src="${path}/com/jquery-3.7.1.js"></script>
<script src="${path}/com/bootstrap.min.js"></script>
    <!-- ===============================================-->
    <!--    JavaScripts-->
    <!-- ===============================================-->
    <script src="vendors/@popperjs/popper.min.js"></script>
    <script src="vendors/bootstrap/bootstrap.min.js"></script>
    <script src="vendors/is/is.min.js"></script>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=window.scroll"></script>
    <script src="vendors/fontawesome/all.min.js"></script>
    <script src="assets/js/theme.js"></script>

    <link href="https://fonts.googleapis.com/css2?family=DM+Serif+Display&amp;family=Rubik:wght@300;400;500;600;700;800&amp;display=swap" rel="stylesheet">
</body>
</html>