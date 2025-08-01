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

<section class="pb-11 pt-7 bg-600">  
  <div class="container">
	<form id="frm01" class="form"> <%-- post 요청 body ename=@@&job=@@ --%>
  	<nav class="navbar navbar-expand-lg navbar-light sticky-top py-3">
	    <input placeholder="이름" name="name" value=""  class="form-control mr-sm-2" />
	    <button class="btn btn-info" type="submit">검색</button>
	    
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
            <th>상담내용</th>
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
                <td>${c.message}</td>               
                <td>${c.regDate}</td>               
            </tr>
        </c:forEach>
    </tbody>
</table>       
</div>

<script type="text/javascript">
	$(document).ready(function(){
		$("#regBtn").click(function(){
			location.href="customerInsert"
		})
	});
	function goDetail(id){
		location.href="/customerDetail?customerId="+id
	}	
</script>
    
</section>

</main>

<!-- 스크립트 -->
<script src="${path}/com/jquery-3.7.1.js"></script>
<script src="${path}/com/bootstrap.min.js"></script>
<script src="vendors/@popperjs/popper.min.js"></script>
<script src="vendors/bootstrap/bootstrap.min.js"></script>
<script src="vendors/fontawesome/all.min.js"></script>
<script src="assets/js/theme.js"></script>

<!-- 상담 신청 fetch 처리 -->
<script>

</script>


<section class="bg-secondary">

        <div class="container">
    <div class="row">
        <!-- 회사 정보 -->
        <div class="col-12 col-sm-12 col-lg-6 mb-4 order-0 order-sm-0">
            <a class="text-decoration-none" href="#"><img src="assets/img/gallery/footer-logo.png" height="51" alt="로고" /></a>
            <p class="text-light my-4">
                <i class="fas fa-map-marker-alt me-3"></i>
                <span class="text-light">1500 Treat Ave, Suite 200 &nbsp;</span>
                <a class="text-light" href="tel:+604-680-9785">+604-680-9785</a><br />
                샌프란시스코, CA 94110
            </p>
            <p class="text-light">
                <i class="fas fa-envelope me-3"></i>
                <a class="text-light" href="mailto:vctung@outlook.com">vctung@outlook.com</a>
            </p>
            <p class="text-light">
                <i class="fas fa-phone-alt me-3"></i>
                <a class="text-light" href="tel:1-800-800-2299">1-800-800-2299 (고객 지원)</a>
            </p>
        </div>

        <!-- 커뮤니티 -->
        <div class="col-6 col-sm-4 col-lg-2 mb-3 order-2 order-sm-1">
            <h5 class="lh-lg fw-bold mb-4 text-light font-sans-serif">커뮤니티</h5>
            <ul class="list-unstyled mb-md-4 mb-lg-0">
                <li class="lh-lg"><a class="text-200" href="#!">학습자</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">파트너</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">개발자</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">베타 테스터</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">번역가</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">블로그</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">기술 블로그</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">강의 센터</a></li>
            </ul>
        </div>

        <!-- 정보 -->
        <div class="col-6 col-sm-4 col-lg-2 mb-3 order-3 order-sm-2">
            <h5 class="lh-lg fw-bold text-light mb-4 font-sans-serif">정보</h5>
            <ul class="list-unstyled mb-md-4 mb-lg-0">
                <li class="lh-lg"><a class="text-200" href="#!">회사 소개</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">가격 안내</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">블로그</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">채용 정보</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">문의하기</a></li>
            </ul>
        </div>

        <!-- 추가 정보 -->
        <div class="col-6 col-sm-4 col-lg-2 mb-3 order-3 order-sm-2">
            <h5 class="lh-lg fw-bold text-light mb-4 font-sans-serif">더 보기</h5>
            <ul class="list-unstyled mb-md-4 mb-lg-0">
                <li class="lh-lg"><a class="text-200" href="#!">보도 자료</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">투자자</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">이용 약관</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">개인정보 보호</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">도움말</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">접근성</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">문의하기</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">기사</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">디렉토리</a></li>
                <li class="lh-lg"><a class="text-200" href="#!">제휴 프로그램</a></li>
            </ul>
        </div>
    </div>
</div>

        <!-- end of .container-->

      </section>
<script src="https://kit.fontawesome.com/a076d05399.js"></script>

</body>
</html>