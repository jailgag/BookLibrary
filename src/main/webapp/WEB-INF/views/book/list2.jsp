<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book-관리(책 대여 가능 목록)</title>
</head>
<body>
	${bList }
	<h1>책대여 가능 목록</h1>
	<table>
		<thead>
			<tr>
				<th class="bookNo">번호</th>
				<th class="bookName">제목</th>
				<th class="bookWrite">글쓴이</th>
				<th class="bookPrice">가격</th>
				<th class="publisher">출판사</th>
				<th  class="genre">장르</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td class="bookNo">1</td>
				<td class="bookName">마이러브</td>
				<td class="bookWrite">이충호</td>
				<td class="bookPrice">4500</td>
				<td class="publisher">서울문화사</td>
				<td class="genre">코믹/순정</td>
			</tr>
			<tr>
				<td class="bookNo">2</td>
				<td class="bookName">떳다 럭키맨</td>
				<td class="bookWrite">나베시마 오시무</td>
				<td class="bookPrice">4500</td>
				<td class="publisher">코믹출판사</td>
				<td class="genre">코믹</td>
			</tr>
		</tbody>
	</table>
</body>
</html>