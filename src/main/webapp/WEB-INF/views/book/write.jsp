<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 등록</title>
	
</head>
<body>
	<fieldset>
		<legend>책 등록</legend>
		<form action="/book/writer" method="post">
			제목 : <input type="text" name="bookName"> <br>
			글쓴이 : <input type="text" name="bookWrite"> <br>
			가격 : <input type="text" name="bookPrice"> <br>
			출판사: <input type="text" name="publisher"> <br>
			장르 : <input type="text" name="genre"> <br>
			<button type="submit">저장</button>
		</form>
	</fieldset>
</body>
</html>