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
		let msg = "${msg}"
		if(msg!=""){
			if(confirm(msg+"\n조회화면으로 이동하시겠습니까?")){
				location.href="classRecordList"
			}
		}
		$("#uptBtn").click(function(){
			if(confirm("수정하시겠습니까?")){
				$("form").attr("action","recordUpdate")
				$("form").submit()
			}
		})	
		
		
    	$("#mainBtn").click(function(){
			location.href="classRecordList"
    	})		
	});
</script>
</head>

<body>
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
</body>
</html>