<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 수정하기</title>
		<link rel="stylesheet" href="../resources/css/reset.css">
		<link rel="stylesheet" href="../resources/css/header.css">
		<link rel="stylesheet" href="../resources/css/footer.css">
</head>
<body>
	<div>
	<jsp:include page="/WEB-INF/views/include/header.jsp"/>
	<main>
		<form action="/book/modify" method="post">
			<h2>책 수정</h2>
			<div>
				<label>번호 :</label>
				<input type="number" name="bookName" value="${bookNo}" readonly>
			</div>
			<div>
				<label>글쓴이 :</label>
				<input type="text" name="bookWrite"value="${book.bookName }">
			</div>
			<div>
				<label>가격 :</label>
				<input type="number" name="bookPrice"value="${bookPrice }">
			</div>
			<div>
				<label>출판사:</label>
				<input type="text" name="publisher"value="${publisher }">
			</div>
			<button type="submit">수정하기</button>
			<a href="#">삭제하기</a>
		</form>
	</main>
	<jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
</body>
</html>