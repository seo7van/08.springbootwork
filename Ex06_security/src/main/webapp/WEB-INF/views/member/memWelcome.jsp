<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jalarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty pageContext.request.userPrincipal}">
		
		<f4>Login된 상태</f4>
		
		${pageContext.request.userPrincipal.name}님이 로그인하였습니다.<br><br>
		</c:if>
	welcome member
</body>
</html>