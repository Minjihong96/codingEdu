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
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/com/bootstrap.min.css" >
<style>
 .font-sans {
    font-family: sans-serif;
  }
</style>
<script src="${path}/com/jquery-3.7.1.js"></script>
<script src="${path}/com/bootstrap.min.js"></script>
 <link rel="apple-touch-icon" sizes="180x180" href="assets/img/favicons/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="assets/img/favicons/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="assets/img/favicons/favicon-16x16.png">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicons/favicon.ico">
    <link rel="manifest" href="assets/img/favicons/manifest.json">
    <meta name="msapplication-TileImage" content="assets/img/favicons/mstile-150x150.png">
    <meta name="theme-color" content="#ffffff">


    <link href="assets/css/theme.css" rel="stylesheet" />
  <style>
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
        <div class="container"><a class="navbar-brand" href="index.html"><img src="assets/img/gallery/logo-n.png"  height="45" alt="logo" /></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"> </span></button>
          <div class="collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto pt-2 pt-lg-0 font-base">
              <li class="nav-item px-2"><a class="nav-link active" aria-current="page" href="index.html">강의 목록</a></li>
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="web-development.html">소개</a></li>
              <li class="nav-item mb-2"><a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/getMemberByPrid?memPrid=${sessionScope.loginUser.memPrid}">마이페이지</a>
            </ul>
           <c:choose>
            	<c:when test="${not empty sessionScope.loginUser}">
            		<a class="btn btn-primary order-1 order-lg-0" href="${pageContext.request.contextPath}/logoutmc">Logout</a>
            	</c:when>
            	<c:otherwise>
            		<a class="btn btn-primary order-1 order-lg-0" href="${pageContext.request.contextPath}/mclogin">Login</a>
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
    <div class="row">
      <!-- 좌측 바 -->
      <div class="col-md-3">
        <div class="bg-white p-3 rounded shadow-sm" style="min-height: 300px;">
          <h5 class="mb-4 font-sans fw-bold">내 메뉴</h5>
          <ul class="nav flex-column">

           <li class="nav-item mb-2">      
              <a class="nav-link text-primary mb-4 font-sans fw-bold" aria-current="page" 
              href="${pageContext.request.contextPath}/stMyInfoList?memPrid=${sessionScope.loginUser.memPrid}">내 정보 확인</a>
           </li>
            <li class="nav-item mb-2">
              <a class="nav-link text-primary mb-4 font-sans fw-bold"
               href="${pageContext.request.contextPath}/stmyCourse">나의 수강 목록 확인</a>
            </li>
          </ul>
        </div>
      </div>

      <!-- 우측 컨텐츠 -->
      <div class="col-md-9">
        <div class="bg-white p-4 rounded shadow-sm">
         <form id="memberInfoForm"> <%-- 회원 정보 조회 또는 수정 폼 --%>
        
          <h4 id="myInfo" class="mb-4 font-sans fw-bold">내 정보</h4>
          <p>여기에 내 정보에 대한 설명을 입력할 수 있습니다.</p>
  <div class="form-group-custom">
        <label for="memId" class="form-label">계정 아이디</label>
        <input type="text" class="form-control" id="memId" name="memId" value="${mem.memId}" readonly>
    </div>
    
    <div class="form-group-custom">
        <label for="memName" class="form-label">이름</label>
        <input type="text" class="form-control" id="memName" name="memName" value="${mem.memName}" required>
    </div>
</form>
          <h4 id="myCourses" class="mb-4 font-sans fw-bold">나의 수강 목록</h4>
          <p>수강 중인 강의 목록이나 강의 관련 정보가 여기에 표시됩니다.</p>
          <img src="assets/img/sample-course.png" alt="강의 이미지" class="img-fluid" style="max-width: 400px;">
        </div>
      </div>
    </div>
  </div>
</section>
      </main>
    <script src="vendors/@popperjs/popper.min.js"></script>
    <script src="vendors/bootstrap/bootstrap.min.js"></script>
    <script src="vendors/is/is.min.js"></script>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=window.scroll"></script>
    <script src="vendors/fontawesome/all.min.js"></script>
    <script src="assets/js/theme.js"></script>

<script type="text/javascript">

</script>
</body>

</html>