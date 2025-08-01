<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="UTF-8"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Page3</title>
<link rel="stylesheet" href="${path}/com/bootstrap.min.css" >
<style>
 .font-sans {
    font-family: sans-serif;
  }
  .valid-msg { font-size: 0.9rem; color: green; }
  .error-msg { font-size: 0.9rem; color: red; }
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
</head>

<body>

    <main class="main" id="top">


      <!-- ============================================-->
      <!-- <section> begin ============================-->
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
        <!-- end of .container-->

      </section>
      <!-- <section> close ============================-->
      <!-- ============================================-->

	  <!-- 
	  sticky-top : 상단에 스크롤 고정, 스크롤해도 페이지 상단에 고정됨 
	  navbar-expand-lg : 화면 너비가 lg(large) 이상일 때는 **수평(navbar 확장)**으로 표시하고, 작을 경우에는 햄버거 메뉴로 전환
	  navbar-light : 밝은 배경에 어울리는 텍스트 색상을 적용 (예: 검정 텍스트)
	  d-block : display:block; 요소를 블록 레벨로 지정
	  data-navbar-on-scroll="data-navbar-on-scroll" : 스크롤에 따라 스타일이 바뀌는 동작을 유도하는 JS 코드가 같이 연결
	  -->
      <nav class="navbar navbar-expand-lg navbar-light sticky-top py-3 d-block" data-navbar-on-scroll="data-navbar-on-scroll">
        <div class="container"><a class="navbar-brand" href="${pageContext.request.contextPath}/pmain"><img src="assets/img/gallery/logo-n.png" height="45" alt="logo" /></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"> </span></button>
          <div class="collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto pt-2 pt-lg-0 font-base">
              <li class="nav-item px-2"><a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/pmaterialList">강의 목록</a></li>
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/pcrInsert">무료 체험 신청</a></li>
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="web-development.html">소개</a></li>
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/pgraphJsp">선호도통계</a></li>
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
        <div class="row">
          <div class="col-md-3">
            <div class="bg-white p-3 rounded shadow-sm" style="min-height: 300px;">
              <h5 class="mb-4 font-sans fw-bold">분석 메뉴</h5>
              <ul class="nav flex-column">
              
                <li class="nav-item px-2">
                
	                <li class="nav-item mb-2">
	                  <a class="nav-link text-primary mb-4 font-sans fw-bold" href="#myCourses">문의 고객 통계</a>
	                  <a class="nav-link text-primary mb-4 font-sans fw-bold" href="#myCourses2">문의 고객 과목 비율</a>
	                </li>
	                                             
              </ul>
            </div>
          </div>

          <div class="col-md-9">
            <div class="bg-white p-4 rounded shadow-sm mb-4">
              <h4 id="myInfo" class="mb-4 font-sans fw-bold">분석 페이지</h4>
              <p>상담신청 고객님들의 분석 그래프 입니다</p>                          
            </div>
            
            <div class="row">    
                                
	            	<div class="col-md-6"> 	            	
	            		<div class="bg-white p-4 rounded shadow-sm mb-4">
					            <h4 id="myCourses" class="mb-4 font-sans fw-bold">문의 고객 과목</h4>
					            <p>최근 문의한 고객님의 과목 비율입니다</p>
					            <div>
					                <canvas id="myPieChart4"></canvas>  		           
					            </div>
					            <div class="mt-4 text-center small">
					                <span class="mr-2">
					                    <i class="fas fa-circle text-primary"></i> Direct
					                </span>
					                <span class="mr-2">
					                    <i class="fas fa-circle text-success"></i> Social
					                </span>
					                <span class="mr-2">
					                    <i class="fas fa-circle text-info"></i> Referral
					                </span>
					            </div>
					        </div>
					     </div>
				   
				     <div class="col-md-6"> 
				     	<div class="bg-white p-4 rounded shadow-sm mb-4">
				            <h4 id="myCourses2" class="mb-4 font-sans fw-bold">문의 고객 연령(미연동)</h4>
				            <p>최근 문의한 고객님의 연령 비율입니다(미연동)</p>
				            <div>
				                <canvas id="myPieChart3"></canvas>
				            </div>
				            <div class="mt-4 text-center small">
				                <span class="mr-2">
				                    <i class="fas fa-circle text-primary"></i> Direct
				                </span>
				                <span class="mr-2">
				                    <i class="fas fa-circle text-success"></i> Social
				                </span>
				                <span class="mr-2">
				                    <i class="fas fa-circle text-info"></i> Referral
				                </span>
				            </div>
				        </div>
				     </div>
				     				     				  
				</div>	
            	 	
		</div>
                   
            <canvas id="deptChart" width="400" height="200"></canvas>
  			<script src="seungwoo/js/demo/abc.js"></script>
                        
          </div>
        </div>
      </div>
    </section>
  </main>

  <script src="seungwoo/vendors/@popperjs/popper.min.js"></script>
  <script src="seungwoo/vendors/bootstrap/bootstrap.min.js"></script>
  <script src="seungwoo/vendors/is/is.min.js"></script>
  <script src="https://polyfill.io/v3/polyfill.min.js?features=window.scroll"></script>
  <script src="seungwoo/vendors/fontawesome/all.min.js"></script>
  <script src="assets/js/theme.js"></script>

  <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
  <script src="seungwoo/vendor/jquery-easing/jquery.easing.min.js"></script>
  <script src="seungwoo/js/sb-admin-2.min.js"></script>
  <script src="seungwoo/vendor/chart.js/Chart.min.js"></script>
  <script src="seungwoo/js/demo/chart-area-demo.js"></script>
  <script src="seungwoo/js/demo/chart-pie-demo.js"></script>
  <script src="seungwoo/js/demo/chart-pie-demo2.js"></script>
  <script src="seungwoo/js/demo/chart-pie-demo3.js"></script>
  <script src="seungwoo/js/demo/chart-pie-demo4.js"></script>

  <script src="seungwoo/js/demo/chart-bar-demo.js"></script>
  
  <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<!-- 외부 도넛차트 코드 연결 -->

</body>
</html>