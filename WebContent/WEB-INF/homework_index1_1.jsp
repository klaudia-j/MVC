<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><c:out value="${language}" default="Cześć"></c:out></p>
	<form action="Homework_Servlet_01_2" method="POST">
		<label> Wybierz język: <select name="language">
				<option value="en">en</option>
				<option value="pl">pl</option>
				<option value="de">de</option>
				<option value="es">es</option>
				<option value="fr">fr</option>
		</select></label> 
		<input type="submit">
	</form>
</body>
</html>