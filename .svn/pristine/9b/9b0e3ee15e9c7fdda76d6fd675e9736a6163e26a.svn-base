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
	td{text-align:center;}
</style>
<script src="${path}/com/jquery-3.7.1.js"></script>
<script src="${path}/com/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
	
	});
</script>
 <!-- ===============================================-->
    <!--    Favicons-->
    <!-- ===============================================-->
    <link rel="apple-touch-icon" sizes="180x180" href="assets/img/favicons/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="assets/img/favicons/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="assets/img/favicons/favicon-16x16.png">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicons/favicon.ico">
    <link rel="manifest" href="assets/img/favicons/manifest.json">
    <meta name="msapplication-TileImage" content="assets/img/favicons/mstile-150x150.png">
    <meta name="theme-color" content="#ffffff">


    <!-- ===============================================-->
    <!--    Stylesheets-->
    <!-- ===============================================-->
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
        <div class="container"><a class="navbar-brand" href="index.html"><img src="assets/img/gallery/logo-n.png" height="45" alt="logo" /></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"> </span></button>
          <div class="collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto pt-2 pt-lg-0 font-base">
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="index.html">Home</a></li>
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="pricing.html">Pricing</a></li>
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="web-development.html">Web Development</a></li>
              <li class="nav-item px-2"><a class="nav-link active" aria-current="page" href="user-research.html">User Research</a></li>
            </ul><a class="btn btn-primary order-1 order-lg-0" href="#!">Sign Up</a>
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
	  <div class="container d-flex justify-content-center">
	    <div class="p-5 bg-white rounded-3 shadow" style="max-width: 500px; width: 100%;">
	      <h1 class="mb-4 text-center">Contact Us</h1>
     		<form id="contactForm" action="${pageContext.request.contextPath}/counsel/submit" method="post">
	        <div class="mb-3">
	          	<label class="form-label" for="name">성함</label>
          		<input class="form-control" type="text" name="name" id="name" required />
	        </div>
    <!--    <div class="mb-3">
	          	<label class="form-label" for="email">이메일</label>
	         	<input class="form-control" type="email" name="email" id="email" required />
	        </div>   -->
	        <div class="mb-3">
	          	<label class="form-label" for="subject">핸드폰</label>
	          	<input class="form-control" type="text" name="subject" id="subject" required />
	        </div>
	        <div class="mb-3">
			    <label class="form-label" for="counselingTime">상담 희망 시간</label>
			    	<select class="form-select" name="counselingTime" id="counselingTime" required>
				        <option value="">시간을 선택해주세요</option>
				        <option value="08:00">오전 8시~오전 9시</option>
				        <option value="09:00">오전 9시~오전 10시</option>
				        <option value="10:00">오전 10시~오전 11시</option>
				        <option value="11:00">오전 11시~오후 12시</option>
				      
				        <option value="13:00">오후 1시~오후 2시</option>
				        <option value="14:00">오후 2시~오후 3시</option>
				        <option value="15:00">오후 3시~오후 4시</option>
				        <option value="16:00">오후 4시~오후 5시</option>
				        <option value="17:00">오후 5시~오후 6시</option>
				        <option value="18:00">오후 6시 이후</option>
			        </select>
				</div>
	        <div class="mb-3">
          		<label class="form-label" for="department">희망 과목 선택</label>
          		<select class="form-select"  name="department" id="department">
	            	<option selected value="front">프론트 엔드</option>
	            	<option value="back">백엔드</option>
	            	<option value="full">풀스택</option>
	            	<option value="other">기타</option>
	          	</select>
	        </div>
	        <div class="mb-4">
		        <label class="form-label" for="message">상세 문의 사항</label>
		        <textarea class="form-control" name="message" id="message" rows="5" required></textarea>
	        </div>
	        <div class="text-center">
	          <button class="btn btn-primary w-100" type="submit">상담 신청</button>
	        </div>
	      </form>
	    </div>
	  </div>

        <!-- end of .container-->

      </section>
      <!-- <section> close ============================-->
      <!-- ============================================-->
      
    </main>
    <!-- ===============================================-->
    <!--    End of Main Content-->
    <!-- ===============================================-->




    <!-- ===============================================-->
    <!--    JavaScripts-->
    <!-- ===============================================-->
    <script src="vendors/@popperjs/popper.min.js"></script>
    <script src="vendors/bootstrap/bootstrap.min.js"></script>
    <script src="vendors/is/is.min.js"></script>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=window.scroll"></script>
    <script src="vendors/fontawesome/all.min.js"></script>
    <script src="assets/js/theme.js"></script>
<script>

  // 비밀번호 일치 확인
  $('#confirmPassword').on('input', function () {
    const pwd = $('#password').val();
    const confirm = $(this).val();
    if (pwd === confirm) {
      $('#pwdMatch').text('비밀번호가 일치합니다.').removeClass('error-msg').addClass('valid-msg');
    } else {
      $('#pwdMatch').text('비밀번호가 일치하지 않습니다.').removeClass('valid-msg').addClass('error-msg');
    }
  });
  // 비밀번호 실시간 유효성 검사
  $('#password').on('input', function () {
    const password = $(this).val();
    const pwdRegex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*()_+]).{10,20}$/;
    if (!pwdRegex.test(password)) {
      $('#pwdValid').text('영문, 숫자, 특수문자 포함 10~20자리로 입력하세요.').removeClass('valid-msg').addClass('error-msg');
    } else {
      $('#pwdValid').text('사용 가능한 비밀번호입니다.').removeClass('error-msg').addClass('valid-msg');
    }
  });

  // 아이디 유효성 검사 및 중복 확인
  $('#id').on('blur', function () {
    const id = $(this).val();
    const idRegex = /^[a-zA-Z0-9]{6,}$/;
    if (!idRegex.test(id)) {
      $('#idCheck').text('아이디는 6자 이상의 영문 또는 숫자 조합이어야 합니다.');
      return;
    }

  // 중복 확인 Ajax 요청
  $.ajax({
      url: 'checkId.jsp',
      type: 'POST',
      data: { id: id },
      success: function (data) {
        $('#idCheck').html(data);
      },
      error: function () {
        $('#idCheck').text('중복 확인에 실패했습니다.');
      }
    });
  });
  //폼 제출 처리
  $('#joinForm').submit(function (e) {
    e.preventDefault();

    const password = $('#password').val();
    const confirmPassword = $('#confirmPassword').val();
    const pwdRegex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*()_+]).{10,20}$/;

    if (!pwdRegex.test(password)) {
      alert('비밀번호가 유효하지 않습니다.');
      return;
    }

    if (password !== confirmPassword) {
      alert('비밀번호가 일치하지 않습니다.');
      return;
    }

    $.ajax({
      url: 'joinProcess.jsp',
      type: 'POST',
      data: $('#joinForm').serialize(),
      success: function (response) {
        $('#resultMsg').html(`<div class="alert alert-success">${response}</div>`);
      },
      error: function () {
        $('#resultMsg').html(`<div class="alert alert-danger">서버 오류 발생</div>`);
      }
    });
  });
  
  
  
  
  
  document.getElementById("contactForm").addEventListener("submit", function(event) {
	    event.preventDefault();

	    const formData = {
	      name: document.getElementById("name").value,
	      phone: document.getElementById("subject").value,
	      counselingTime: document.getElementById("counselingTime").value,
	      department: document.getElementById("department").value,
	      message: document.getElementById("message").value
	    };

	    fetch("/api/counsel/submit", {
	      method: "POST",
	      headers: {
	        "Content-Type": "application/json"
	      },
	      body: JSON.stringify(formData)
	    })
	    .then(response => response.text())
	    .then(data => alert(data))
	    .catch(error => alert("에러 발생: " + error));
	  });


</script>

    <link href="https://fonts.googleapis.com/css2?family=DM+Serif+Display&amp;family=Rubik:wght@300;400;500;600;700;800&amp;display=swap" rel="stylesheet">
  </body>

</html>