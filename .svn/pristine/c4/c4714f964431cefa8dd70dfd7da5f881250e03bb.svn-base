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
</head>

<body>
<div class="jumbotron text-center">
  	<h2>사원정보리스트zz</h2>
	<h2>데이터 건수:${crList.size()}</h2>
</div>
<div class="container">
	<form id="frm01" class="form"> <%-- post 요청 body ename=@@&job=@@ --%>
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input placeholder="사원명" name="name" value=""  class="form-control mr-sm-2" />
	    <button class="btn btn-info" type="submit">Search</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
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
            <th>부서</th>
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
                
            </tr>
        </c:forEach>
    </tbody>
</table>   
    
</div>
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">타이틀</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
		<form id="frm02" class="form"  method="post">
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="사원명 입력" name="ename">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="직책명 입력" name="job">
	      </div>
	     </div>
	    </form> 
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>