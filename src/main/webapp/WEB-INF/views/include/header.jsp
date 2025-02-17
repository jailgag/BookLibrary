<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header id="header">
	<div id="logo">
		<a href="/">
			<h1>제일 BOOK</h1>
		</a>
	</div>
		<nav id="nav">
		<ul class="topMenu">
			<li><a href="/book/list">책관리</a></li>
			
			<li><a href="#">대여관리</a></li>
			<li><a href="#">회원관리</a></li>
			<c:if test="${sessionScope.result.userId == null }">
			<li><a href="/customer/login">로그인</a></li>
			</c:if>
			<c:if test="${sessionScope.result.userId != null }">
				<li><a href="/customer/logout">로그아웃</a></li>
			</c:if>
		</ul>
	</nav>
</header>