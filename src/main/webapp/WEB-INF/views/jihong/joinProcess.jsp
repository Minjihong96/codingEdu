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


<%--
    request.setCharacterEncoding("UTF-8");

    String id = request.getParameter("id");
    String password = request.getParameter("password");
    String phone = request.getParameter("phone");
    String address = request.getParameter("address");
    String birth = request.getParameter("birth");
    String role = request.getParameter("role");

    // DB 연결
    String url = "jdbc:mysql://localhost:3306/yourdb";
    String dbUser = "root";
    String dbPass = "1234";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
        PreparedStatement pstmt = conn.prepareStatement(
            "INSERT INTO users (id, password, phone, address, birth, role) VALUES (?, ?, ?, ?, ?, ?)"
        );
        pstmt.setString(1, id);
        pstmt.setString(2, password);
        pstmt.setString(3, phone);
        pstmt.setString(4, address);
        pstmt.setString(5, birth);
        pstmt.setString(6, role);
        pstmt.executeUpdate();
        pstmt.close();
        conn.close();

        out.print("회원가입이 완료되었습니다.");
    } catch (Exception e) {
        out.print("가입 처리 중 오류가 발생했습니다.");
    }
--%>
</html>