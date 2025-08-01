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
          <p class="my-2 fs--1"><i class="fas fa-map-marker-alt me-3"></i>1600 Amphitheatre Parkway, CA 94043</p>
        </div>
        <div class="col-auto ms-md-auto order-md-2 d-none d-sm-block">
          <ul class="list-unstyled list-inline my-2">
            <li class="list-inline-item"><a href="#"><i class="fab fa-facebook-f text-900"></i></a></li>
            <li class="list-inline-item"><a href="#"><i class="fab fa-pinterest text-900"></i></a></li>
            <li class="list-inline-item"><a href="#"><i class="fab fa-twitter text-900"></i></a></li>
            <li class="list-inline-item"><a href="#"><i class="fab fa-instagram text-900"></i></a></li>
          </ul>
        </div>
        <div class="col-auto">
          <p class="my-2 fs--1"><i class="fas fa-envelope me-3"></i><a href="mailto:vctung@outlook.com">vctung@outlook.com</a></p>
        </div>
      </div>
    </div>
  </section>

  <nav class="navbar navbar-expand-lg navbar-light sticky-top py-3">
    <div class="container">
      <a class="navbar-brand" href="index.html"><img src="assets/img/gallery/logo-n.png" height="45" alt="logo" /></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ms-auto">
          <li class="nav-item"><a class="nav-link" href="index.html">Home</a></li>
          <li class="nav-item"><a class="nav-link" href="pricing.html">Pricing</a></li>
          <li class="nav-item"><a class="nav-link" href="web-development.html">Web Development</a></li>
          <li class="nav-item"><a class="nav-link active" href="user-research.html">User Research</a></li>
        </ul>
        <a class="btn btn-primary ms-3" href="#!">Sign Up</a>
      </div>
    </div>
  </nav>

  <section class="pb-11 pt-7 bg-600">
    <div class="container d-flex justify-content-center">
      <div class="p-5 bg-white rounded-3 shadow" style="max-width: 500px; width: 100%;">
        <h1 class="mb-4 text-center">Contact Us</h1>
        <form id="contactForm">
          	<div class="mb-3">
	          	<label class="form-label">아이디</label>
          		<input class="form-control" type="text" name="id" id="id" required />
          		<div id="idCheck" class="error-msg"></div>
	        </div>
	        <div class="mb-3">
	          	<label class="form-label">비밀번호</label>
	         	<input class="form-control" type="password" name="password" id="password" required />
	         	<div id="pwdValid" class="error-msg"></div>
	        </div>
          <div class="text-center mb-3"> <button class="btn btn-primary w-100" type="submit">로그인</button>
          </div>
          <div class="text-center">
            <p class="fs--1 mb-1">
              <a href="gichan2" class="text-decoration-none">가입하기</a>
            </p>
            <p class="fs--1 mb-0">
              <a href="404" class="text-decoration-none">계정찾기</a>
            </p>
          </div>
        </form>
      </div>
    </div>
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
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(formData)
  })
  .then(response => response.text())
  .then(data => alert(data))
  .catch(error => alert("에러 발생: " + error));
});

// 비밀번호 유효성 검사
$('#password').on('input', function () {
    const password = $(this).val();
    const pwdRegex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*()_+]).{10,20}$/;
    
    if (!pwdRegex.test(password)) {
      $('#pwdValid').text('영문, 숫자, 특수문자 포함 10~20자리로 입력하세요.').removeClass('valid-msg').addClass('error-msg');
    } else {
      $('#pwdValid').text('').removeClass('error-msg').addClass('valid-msg');
    }

    // 입력란이 비어 있으면 경고 메시지 제거
    if (password === '') {
      $('#pwdValid').text('').removeClass('error-msg valid-msg');
    }
});

// 아이디 유효성 검사 및 중복 확인
$('#id').on('blur', function () {
    const id = $(this).val();
    const idRegex = /^[a-zA-Z0-9]{6,}$/;
    
    if (!idRegex.test(id)) {
      $('#idCheck').text('아이디는 6자 이상의 영문 또는 숫자 조합이어야 합니다.');
    } else {
      $('#idCheck').text('');
    }

    // 입력란이 비어 있으면 경고 메시지 제거
    if (id === '') {
      $('#idCheck').text('');
    }
});
</script>


<!-- 폰트 -->
<link href="https://fonts.googleapis.com/css2?family=DM+Serif+Display&family=Rubik:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">

</body>
</html>