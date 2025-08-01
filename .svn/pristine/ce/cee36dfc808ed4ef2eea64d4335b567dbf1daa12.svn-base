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
    String id = request.getParameter("id");
    boolean isDuplicate = false;

    // 예: DB 연결 (JDBC 방식)
    String url = "jdbc:mysql://localhost:3306/yourdb";
    String dbUser = "root";
    String dbPass = "1234";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
        PreparedStatement pstmt = conn.prepareStatement("SELECT id FROM users WHERE id = ?");
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();
        isDuplicate = rs.next();
        rs.close();
        pstmt.close();
        conn.close();
    } catch (Exception e) {
        out.print("DB 오류");
        return;
    }

    if (isDuplicate) {
        out.print("<span class='error-msg'>이미 사용 중인 아이디입니다.</span>");
    } else {
        out.print("<span class='valid-msg'>사용 가능한 아이디입니다.</span>");
    }
--%>
</html>