<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Servlet_04" method="POST">
		<c:forEach varStatus="stat" begin="1" end="${amount}">
			<h1>Książka${stat.index}</h1>
			<label> Title: <input type="text" name="title${stat.index}">
			</label>
			<label> Author: <input type="text" name="author${stat.index}">
			</label>
			<label> Isbn: <input type="number" name="isbn${stat.index}">
			</label>
			<input type="hidden" name="amount" value="${amount}">
			<br>
		</c:forEach>
		<input type="submit">
	</form>
</body>
</html>