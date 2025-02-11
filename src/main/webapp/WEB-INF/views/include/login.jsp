<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제일 BOOK</title>
		<link rel="stylesheet" href="../resources/css/reset.css">
		<link rel="stylesheet" href="../resources/css/header.css">
		<link rel="stylesheet" href="../resources/css/footer.css">
</head>
<body>
			<jsp:include page="/WEB-INF/views/include/header.jsp"/>
	<fieldset>
		<legend>로그인</legend>
		<form action="/customer/login" method="post">
			ID: <input type="text" name=userId><br>
			PW: <input type="password" name="userPw"><br>
			<input type="submit" value="로그인">
		</form>
	</fieldset>
		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
</body>
</html>