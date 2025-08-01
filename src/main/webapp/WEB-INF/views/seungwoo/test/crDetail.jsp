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

  <!-- 상단 정보 -->
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

  <!-- 네비게이션 -->
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

  <!-- 상담 신청 폼 -->
  <section class="pb-11 pt-7 bg-600">
    <div class="container d-flex justify-content-center">
      <div class="p-5 bg-white rounded-3 shadow" style="max-width: 500px; width: 100%;">
        <h1 class="mb-4 text-center">Contact Us</h1>
        <form id="contactForm">
          <div class="mb-3">
            <label class="form-label" for="name">성함</label>
            <input class="form-control" type="text" id="name" required />
          </div>
          <div class="mb-3">
            <label class="form-label" for="subject">핸드폰</label>
            <input class="form-control" type="text" id="subject" required />
          </div>
          <div class="mb-3">
            <label class="form-label" for="counselingTime">상담 희망 시간</label>
            <select class="form-select" id="counselingTime" required>
              <option value="">시간을 선택해주세요</option>
              <option value="08:00">오전 8시~9시</option>
              <option value="09:00">오전 9시~10시</option>
              <option value="10:00">오전 10시~11시</option>
              <option value="11:00">오전 11시~12시</option>
              <option value="13:00">오후 1시~2시</option>
              <option value="14:00">오후 2시~3시</option>
              <option value="15:00">오후 3시~4시</option>
              <option value="16:00">오후 4시~5시</option>
              <option value="17:00">오후 5시~6시</option>
              <option value="18:00">오후 6시 이후</option>
            </select>
          </div>
          <div class="mb-3">
            <label class="form-label" for="department">희망 과목</label>
            <select class="form-select" id="department">
              <option value="front">프론트 엔드</option>
              <option value="back">백엔드</option>
              <option value="full">풀스택</option>
              <option value="other">기타</option>
            </select>
          </div>
          <div class="mb-4">
            <label class="form-label" for="message">상세 문의 사항</label>
            <textarea class="form-control" id="message" rows="5" required></textarea>
          </div>
          <div class="text-center">
            <button class="btn btn-primary w-100" type="submit">상담 신청</button>
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
</script>

<!-- 폰트 -->
<link href="https://fonts.googleapis.com/css2?family=DM+Serif+Display&family=Rubik:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">

</body>
</html>