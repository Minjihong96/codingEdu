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
  <link rel="stylesheet" href="${path}/com/bootstrap.min.css">
  <link rel="stylesheet" href="assets/css/theme.css">
  <link rel="apple-touch-icon" sizes="180x180" href="assets/img/favicons/apple-touch-icon.png">
  <link rel="icon" type="image/png" sizes="32x32" href="assets/img/favicons/favicon-32x32.png">
  <link rel="icon" type="image/png" sizes="16x16" href="assets/img/favicons/favicon-16x16.png">
  <link rel="shortcut icon" href="assets/img/favicons/favicon.ico">
  <meta name="theme-color" content="#ffffff">
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/com/bootstrap.min.css" >

<style>
	td{text-align:center;}
</style>
<script src="${path}/com/jquery-3.7.1.js"></script>
<script src="${path}/com/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		let msg = "${msg}"
		if(msg!=""){
			if(confirm(msg+"\n조회화면으로 이동하시겠습니까?")){
				location.href="pclassRecordList"
			}
		}
		$("#uptBtn").click(function(){
			if(confirm("수정하시겠습니까?")){
				$("form").attr("action","precordUpdate")
				$("form").submit()
			}
		})	
		
		
    	$("#mainBtn").click(function(){
			location.href="pclassRecordList"
    	})		
	});
</script>
<link href="assets/css/theme.css" rel="stylesheet" />
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
      
<div class="jumbotron text-center">
  <h2>상세2 ${r.recordId}</h2>
</div>
   <div class="container">
        <form  method="post">
             <div class="form-group">
                <label for="recordId">고객아이디</label>
                <input type="text" value="${r.recordId}" class="form-control" id="recordId" name="recordId"  readOnly required>
            </div>       
            <div class="form-group">
                <label for="memPrid">학생명</label>
                <input type="text" value="${r.memPrid}"  class="form-control" id="memPrid" name="memPrid" placeholder="이름을 입력하세요" required>
            </div>
            
            <div class="form-group">
                <label for="classDate">수업 날짜</label>
                <input type="date" value="<fmt:formatDate value='${r.classDate}' pattern='yyyy-MM-dd'/>"  class="form-control" id="classDate" name="classDate" placeholder="메일를 입력하세요" required>            
            </div>
            
            <div class="form-group">
                <label for="classContents">수업 내용</label>
                <input type="text" value="${r.classContents}"  class="form-control" id="classContents" name="classContents" placeholder="전화번호를 입력하세요" required>
            </div>
            <div class="form-group">
                <label for="subject">과제</label>
                <input type="text" value="${r.subject}"  class="form-control" id="subject" name="subject" placeholder="전화번호를 입력하세요" required>
            </div>
            <div class="form-group">
                <label for="sessionNumber">잔여 수업 회차</label>
                <input type="text" value="${r.sessionNumber}"  class="form-control" id="sessionNumber" name="sessionNumber" placeholder="전화번호를 입력하세요" required>
            </div>
            <div class="form-group">
                <label for="payment">결제</label>
                <input type="text" value="${r.payment}"  class="form-control" id="payment" name="payment" placeholder="전화번호를 입력하세요" required>
            </div>
            <div class="form-group">
                <label for="etc">기타</label>
                <input type="text" value="${r.etc}"  class="form-control" id="etc" name="etc" placeholder="전화번호를 입력하세요" required>
            </div>
           
            <button type="button" id="uptBtn" class="btn btn-primary">수정</button>

            <button type="button" class="btn btn-info" id="mainBtn">메인화면</button>
        </form>
      </div>  
          <script src="vendors/@popperjs/popper.min.js"></script>
    <script src="vendors/bootstrap/bootstrap.min.js"></script>
    <script src="vendors/is/is.min.js"></script>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=window.scroll"></script>
    <script src="vendors/fontawesome/all.min.js"></script>
    <script src="assets/js/theme.js"></script>

    <link href="https://fonts.googleapis.com/css2?family=DM+Serif+Display&amp;family=Rubik:wght@300;400;500;600;700;800&amp;display=swap" rel="stylesheet">
 
</body>
</html>