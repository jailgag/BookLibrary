<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제일 book - 전체책 검색</title>
		<link rel="stylesheet" href="../resources/css/reset.css">
		<link rel="stylesheet" href="../resources/css/header.css">
		<link rel="stylesheet" href="../resources/css/footer.css">
</head>
<body>
		<div>
		<jsp:include page="/WEB-INF/views/include/header.jsp"/>
	<section>
	<h1>책관리</h1>
	<a href="/book/write">책등록</a>
	<table>
		<thead>
			<tr>
				<th class="no">번호</th>
				<th class="name">제목</th>
				<th class="write">글쓴이</th>
				<th class="price">가격</th>
				<th class="publisher">출판사</th>
				<th class="genre">장르</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${bList }" var="book">
				<tr>
					<td class="no">${book.bookNo }</td>
					<td class="name">${book.bookName }</td>
					<td class="write">${book.bookWrite }</td>
					<td class="price">${book.bookPrice }</td>
					<td class="publisher">${book.publisher }</td>
					<td class="genre">${book.genre }</td>
				</tr>
			</c:forEach>
		</tbody>
			<div class="pagination">
				<a href="#" class="prev">&lt;</a>
				<a href="#" class="active">1</a>
				<a href="#">2</a>
				<a href="#">3</a>
				<a href="#">4</a>
				<a href="#">5</a>
				<a href="#" class="next">&gt;</a>
			</div>
	</table>
	</section>	
		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
</div>
</body>
</html>