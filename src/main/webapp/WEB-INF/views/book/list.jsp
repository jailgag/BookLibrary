<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제일 book - 전체책 검색</title>
</head>
<body>
${bList( }
	<h1>책관리</h1>
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
			<tr>
				<td class="no">1</td>
				<td class="name">마이러브</td>
				<td class="write">이충호</td>
				<td class="price">4500</td>
				<td class="publisher">서울문화사</td>
				<td class="genre">코믹/순정</td>
			</tr>
			<tr>
				<td class="no">2</td>
				<td class="name">떳다 럭키맨</td>
				<td class="write">나베시마 오사무</td>
				<td class="price">4500</td>
				<td class="publisher">코믹출판사</td>
				<td class="genre">코믹</td>
			</tr>
			<tr>
				<td class="no">3</td>
				<td class="name">만만하게 보이지 않는 대화법</td>
				<td class="write">나이토 요시히토</td>
				<td class="price">12800</td>
				<td class="publisher">홍익출판사</td>
				<td class="genre">심리기술</td>
			</tr>
			<tr>
				<td class="no">4</td>
				<td class="name">열혈강호</td>
				<td class="write">전극진</td>
				<td class="price">4500</td>
				<td class="publisher">대원아이씨</td>
				<td class="genre">무협</td>
			</tr>
			<tr>
				<td class="no">5</td>
				<td class="name">고스트바둑왕</td>
				<td class="write">카미야 쥰</td>
				<td class="price">5000</td>
				<td class="publisher">점프</td>
				<td class="genre">드라마</td>
			</tr>
		</tbody>
	</table>
</body>
</html>