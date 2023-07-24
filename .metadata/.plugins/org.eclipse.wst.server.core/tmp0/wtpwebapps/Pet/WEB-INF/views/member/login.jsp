<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<html>
<head>
	<title>Home</title>
		<!-- 합쳐지고 최소화된 최신 CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<!-- 부가적인 테마 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 
</head>
<body>
<%@ include file="/WEB-INF/views/index.jsp"%>
	<form name='homeForm' method="post" action="/member/login">
		<div>
			<label for="userId"></label>
			<input type="text" id="userId" name="userId">
		</div>
		<div>
			<label for="userPass"></label>
			<input type="password" id="userPass" name="userPass">
		</div>
		<div>
			<button type="submit">로그인</button>
			<button type="button" onClick="location.href='/member/register'">회원가입</button>
		</div>
	</form>
</body>
</html>