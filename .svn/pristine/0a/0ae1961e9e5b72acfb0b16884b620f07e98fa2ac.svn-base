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
/* ===============================================*/
/* 회원 정보 폼을 위한 추가 스타일                      */
/* ===============================================*/

/* 폼 전체를 감싸고 중앙 정렬하는 컨테이너 역할 */
#memberInfoForm {
    max-width: 700px;  /* 폼의 최대 너비 지정 */
    margin: 2rem auto; /* 상하 여백 2rem, 좌우는 자동으로 계산하여 중앙 정렬 */
    padding: 2.5rem;   /* 폼 내부의 여백 */
    background-color: #ffffff; /* 폼 배경색 */
    border-radius: 15px; /* 폼의 모서리를 둥글게 */
    box-shadow: 0 8px 16px rgba(0,0,0,0.1); /* 입체감을 주는 그림자 효과 */
}

/* 폼 제목 스타일 (h1 태그가 폼 바깥에 있지만 같이 스타일링) */
.form-title {
    color: #ffffff; /* 제목 색상을 흰색으로 */
    text-shadow: 1px 1px 2px rgba(0,0,0,0.2); /* 텍스트 그림자 */
}


/* 각 입력 필드(라벨+인풋)를 묶는 그룹 */
.form-group-custom {
    margin-bottom: 1.5rem; /* 각 그룹 사이의 하단 여백 */
}

/* 라벨(Label) 스타일 */
.form-group-custom .form-label {
    font-weight: bold;    /* 글씨를 굵게 */
    display: block;       /* 라벨이 한 줄을 모두 차지하도록 설정 */
    margin-bottom: 0.5rem;/* 라벨과 입력창 사이의 여백 */
    color: #495057;       /* 라벨 글씨 색상 */
    text-align: left;     /* 가독성을 위해 라벨 텍스트는 왼쪽 정렬을 유지 */
}

/* 입력창(input, textarea) 공통 스타일 */
.form-group-custom .form-control {
    border-radius: 8px; /* 입력창 모서리를 둥글게 */
    border: 1px solid #ced4da; /* 테두리 색상 */
    padding: 10px 15px; /* 입력창 내부 여백 */
    transition: border-color 0.2s, box-shadow 0.2s; /* 부드러운 전환 효과 */
}

/* 입력창에 포커스가 갔을 때 스타일 */
.form-group-custom .form-control:focus {
    border-color: #86b7fe; /* 포커스 시 테두리 색상 변경 */
    box-shadow: 0 0 0 0.25rem rgba(13, 110, 253, 0.25); /* 포커스 시 외부 그림자 효과 */
    outline: none; /* 기본 아웃라인 제거 */
}

/* 읽기 전용(readonly) 입력창 스타일 */
.form-group-custom .form-control[readonly] {
    background-color: #e9ecef; /* 배경색을 약간 어둡게 */
    cursor: not-allowed;      /* 마우스 커서를 금지 모양으로 */
}

/* 회원 정보 수정 버튼 스타일 */
#uptBtn {
    padding: 12px 25px; /* 버튼 내부 여백 */
    font-size: 1.1rem;  /* 버튼 글씨 크기 */
    font-weight: bold;
    border-radius: 8px; /* 버튼 모서리를 둥글게 */
    width: 100%; /* 버튼 너비를 폼에 꽉 채움 */
}
#delBtn {
    padding: 12px 25px; /* 버튼 내부 여백 */
    font-size: 1.1rem;  /* 버튼 글씨 크기 */
    font-weight: bold;
    border-radius: 8px; /* 버튼 모서리를 둥글게 */
    width: 100%; /* 버튼 너비를 폼에 꽉 채움 */
}
	td{text-align:center;}
</style>
<script src="${path}/com/jquery-3.7.1.js"></script>
<script src="${path}/com/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
    	$("#uptBtn").click(function(){
			if(confirm("수정하시겠습니까?")) {
				$("form").attr("action","updateMem")
				$("form").submit()
			}
		})
		
		$("#delBtn").click(function(){
			if(confirm("삭제하시겠습니까?")) {
				$("form").attr("action","deleteMem")
				$("form").submit()
			}
		})
	});
</script>
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
        <div class="container"><a class="navbar-brand" href="${pageContext.request.contextPath}/padminmain"><img src="assets/img/gallery/logo-n.png"  height="45" alt="logo" /></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"> </span></button>
          <div class="collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto pt-2 pt-lg-0 font-base">
              <li class="nav-item px-2"><a class="nav-link active" aria-current="page" href="index.html">강의 목록</a></li>
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/pcrList">무료신청확인</a></li>
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/gigetMemberList">회원정보리스트</a></li>
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/gigetMemberDetail?memPrid=${sessionScope.loginUser.memPrid}">회원정보상세</a></li>
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
	  <h1 class="mb-4 mt-5 text-center" style="font-family: sans-serif;">회원 정보</h1>
          <%-- 
              'member'라는 이름의 Java Bean 객체가 Spring Controller의 Model을 통해 전달된다고 가정합니다.
              예: @GetMapping("/memberInfo") public String getMemberInfo(Model model) {
                  model.addAttribute("member", memberService.getLoggedInMember());
                  return "your_jsp_file";
              }
              
                <c:if test="${not empty sessionScope.loginUser}">
          --%>
         <%-- member 객체가 Model에 있다면 (로그인된 상태 등) --%>
<form id="memberInfoForm" method="post"> <%-- 회원 정보 조회 또는 수정 폼 --%>
    <div class="form-group-custom">
        <label for="memPrid" class="form-label">회원 고유번호</label>
        <%-- memPrid는 Primary Key이므로 수정할 수 없도록 readonly 처리합니다. --%>
        <input type="text" class="form-control" id="memPrid" name="memPrid" value="${mem.memPrid}" readonly>
    </div>

    <div class="form-group-custom">
        <label for="memId" class="form-label">계정 아이디</label>
        <input type="text" class="form-control" id="memId" name="memId" value="${mem.memId}" readonly>
    </div>
    
    <div class="form-group-custom">
        <label for="memPwd" class="form-label">비밀번호</label>
        <input type="password" class="form-control" id="memPwd" name="memPwd" value="${mem.memPwd}" required>
    </div>
    
    
    <div class="form-group-custom">
        <label for="memName" class="form-label">이름</label>
        <input type="text" class="form-control" id="memName" name="memName" value="${mem.memName}" required>
    </div>

    <div class="form-group-custom">
        <label for="memPhone" class="form-label">핸드폰</label>
        <input type="text" class="form-control" id="memPhone" name="memPhone" value="${mem.memPhone}" placeholder="010-1234-5678" required>
    </div>

    <div class="form-group-custom">
        <label for="memEmail" class="form-label">이메일</label>
        <input type="email" class="form-control" id="memEmail" name="memEmail" value="${mem.memEmail}" placeholder="example@domain.com" required>
    </div>
    
    <div class="form-group-custom">
        <label for="memAddress" class="form-label">주소</label>
        <textarea class="form-control" id="memAddress" name="memAddress" rows="3" placeholder="주소를 입력하세요" required>${mem.memAddress}</textarea>
    </div>

    <div class="form-group-custom">
        <label for="memBirthday" class="form-label">생일</label>
        <%-- 생년월일은 보통 시간 정보가 불필요하므로 'yyyy-MM-dd' 패턴을 사용합니다. --%>
        <input type="date" class="form-control" id="memBirthday" name="memBirthday" value="<fmt:formatDate value="${mem.memBirthday}" pattern="yyyy-MM-dd"/>" placeholder="YYYY-MM-DD" required>
    </div>

    <div class="form-group-custom">
        <label for="accountType" class="form-label">가입 유형</label>
        <input type="text" class="form-control" id="accountType" name="accountType" value="${mem.accountType}">
    </div>

    <div class="text-center mt-4">
        <button class="btn btn-primary" type="button" id="uptBtn">회원 정보 수정</button>
        <%-- 필요에 따라 다른 버튼(예: 목록으로 돌아가기)을 추가할 수 있습니다. --%>
    </div>

    <div class="text-center mt-4">
        <button class="btn btn-primary" type="button" id="delBtn">회원 정보 삭제</button>
        <%-- 필요에 따라 다른 버튼(예: 목록으로 돌아가기)을 추가할 수 있습니다. --%>
    </div>
</form>
          
          <%-- 
          </c:if>
          <c:if test="${empty sessionScope.loginUser}">
            <p class="text-center">로그인 후 회원 정보를 확인할 수 있습니다.</p>
          </c:if>
          회원 정보 확인 섹션 추가 끝 --%>
	

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